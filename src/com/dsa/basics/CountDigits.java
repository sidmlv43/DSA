package com.dsa.basics;

public class CountDigits {
    public static void main(String[] args) {
        int n = -7877666;
        int ans = solution(n);
        System.out.println(ans);
        int ansOpt = solutionOptimized(n);
        System.out.println(ansOpt);
    }

    public static int solution(int n) {
        int count = 0;
        if(n == 0) return 1;
        if(n < 0) {
            n *= -1;
        }

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static int solutionOptimized(int n) {
        if (n == 0) return 1;
        if (n < 0) {
            n *= -1;
        }
        return (int) Math.log10(n) + 1;
    }
}
