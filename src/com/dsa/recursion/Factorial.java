package com.dsa.recursion;

public class Factorial {
    static void main() {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        if (n <= 0) return 1;
        return n * solution(n -1);
    }
}
