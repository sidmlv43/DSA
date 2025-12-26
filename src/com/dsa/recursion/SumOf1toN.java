package com.dsa.recursion;

public class SumOf1toN {
    static void main() {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if (n == 1) return n;
        return n + solution(n -1);
    }
}
