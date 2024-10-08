import java.util.*;

public class matrixChainMultiplication {
    // function definition of the memoization approach
    // avoid the overlapping subproblem issue
    // time complexity and space complexity
    // how we can approach for tabulation(no recursion)
    public static int minMatrixMulMemo(int[] arr, int i, int j){
        int n = arr.length;
        int[][] dp = new int[n][n];
        // Initialization of all the values inside the 2D array with -1
        for(int[] row:dp){
           Arrays.fill(row, -1);
        }
        return minMatrixMulMemohelper(arr, i, j, dp);
    }

    public static int minMatrixMulMemohelper(int[] arr, int i, int j, int[][] dp){
        // base case condition
        if(i == j){
            return 0;
        }

        // optimized logic 
        // avoid the recomputation of the repeated function calls
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        // recursive function call
        int minOpr = Integer.MAX_VALUE;
        for(int k = i; k<j; k++){
            int operations = minMatrixMul(arr, i, k) + minMatrixMul(arr, k+1, j) + arr[i-1] * arr[k] * arr[j];
            minOpr = Math.min(operations, minOpr);
        }
        dp[i][j] = minOpr;
        return minOpr;
    }


    // function definition
    // Recursive approach
    // time complexity: Exponential time complexity
    // space complexity: O(n)

    public static int minMatrixMul(int[] arr, int i, int j){
        // base case condition
        if(i == j){
            return 0;
        }
        // recursive function call
        int minOpr = Integer.MAX_VALUE;
        for(int k = i; k<j; k++){
            int operations = minMatrixMul(arr, i, k) + minMatrixMul(arr, k+1, j) + arr[i-1] * arr[k] * arr[j];
            minOpr = Math.min(operations, minOpr);
        }
        return minOpr;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;

        int i = 1, j = n-1;
        // function calling
        System.out.println("Minimum operation required for above Matrix Multiplication: "+minMatrixMulMemo(arr, i, j));
    }
}
