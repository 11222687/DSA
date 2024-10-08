import java.util.*;

class fibonacciSeries {

    public static Map<Integer, Long> memo = new HashMap<>();

    // function calling - Recursive Approach
    // time complexity - O(2^n)
    // space complexity - O(log n) or O(n)

    public static int fib(int n){
        // 1. base case condition
        if(n <= 1){
            return n;
        }

        // 2. recursive function call
        return fib(n - 1) + fib(n - 2);
    }
   
    // function calling - Memoization Dynamic Programming (Enhanced Recursion)
    // time complexity - O(n)
    // space complexity - stack space + hashtable - O(n)
    public static long fibMemo(int n){
        // 1. base case condition
        if(n <= 1){
            return n;
        }

        // optimized logic - avoid the recomputations in the recursive function call
        if(memo.containsKey(n)){
            return memo.get(n);
        }   

        // 2. recursive function call
        long fibVal = fibMemo(n-1) + fibMemo(n-2);
        memo.put(n, fibVal);
        return fibVal;
    }


    // function calling - Tabulation Dynamic Programming (No Recursion)
    // time complexity - O(n)
    // space complexity - O(n)

    public static long fibTab(int n){
        // intialization of an array
        long fib[] = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }


    // function calling - Most optimized approach
    // time complexity - O(n)
    // space complexity - O(1)
    
    public static long fibOpt(int n){
        long first = 0, second = 1, third;
        for(int i=2; i<=n; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("The fibonacci series value is: "+fibOpt(n));
    }
}
