public class LongestCommonSubsequence {

    // Tabulation approach(No recursion) - Dynamic Programming
    // time complexity = O(m*n)
    // space complexity = O(m*n)
    public static int lcsTabu(String s1, String s2, int m, int n){
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }

                else if(s1.charAt(i-1)  == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }




    // Memoization approach(Enhanced recursion) - Dynamic Programming
    // time complexity = O(m*n)
    // space complexity = O(m*n)
    public static int lcsMemo(String s1, String s2, int m, int n, int[][] dp){
         // base case condition 
         if(m == 0 || n == 0){
            return 0;
        }

        // optimization - avoid the recomputation of the same function calls
        if(dp[m][n] != -1){
            return dp[m][n];
        }

        // recursive function call
        // exact match
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return dp[m][n] = 1 + lcs(s1, s2, m-1, n-1);
        }
        // no exact match
        else{
            return dp[m][n] = Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
        }
    }


    // function definition of lcs using the recursive approach
    // time complexity: O(2^m*n)
    // space complexity: O(n)
    // reason overlapping subproblem
    public static int lcs(String s1, String s2, int m, int n){
        // base case condition 
        if(m == 0 || n == 0){
            return 0;
        }

        // recursive function call
        // exact match
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + lcs(s1, s2, m-1, n-1);
        }
        // no exact match
        else{
            return Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
        }

    }

    public static void main(String[] args){
        // lcs = GTAB (4)
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];
        // intialization of the 2D array
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println("The longest common subsequence of the above string is: "+lcsTabu(s1, s2, m, n));

    }
}
