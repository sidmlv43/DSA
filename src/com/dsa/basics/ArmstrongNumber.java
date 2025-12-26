package com.dsa.basics;

public class ArmstrongNumber {
    static void main() {
        int n = 153;
        System.out.println(solution(n));
    }

    public static boolean solution(int n) {
        int x = n;
        int ans = 0;
        int count = countDigit(n);

        while (n > 0) {
            int ld = n % 10;
            ans += (int) Math.pow(ld, count);
            System.out.println(ans);
            n /= 10;
        }

        return ans == x;
    }

    public static int countDigit(int n) {
        if(n == 0) return n;
        n = Math.abs(n);
        return (int) Math.log10(n) + 1;
    }
}
