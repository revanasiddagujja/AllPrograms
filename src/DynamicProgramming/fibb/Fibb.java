package DynamicProgramming.fibb;

import java.util.Arrays;
import java.util.Scanner;


public class Fibb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));

    }
    static int fib(int n, int[] dp) {
        if (n <= 1)
            return n;

        if(dp[n]!= -1) return dp[n];

        return dp[n]=fib(n-1,dp)+fib(n-2,dp);

    }
}
