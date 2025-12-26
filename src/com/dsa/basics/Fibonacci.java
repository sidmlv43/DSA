package com.dsa.basics;

public class Fibonacci {
    static void main() {
        System.out.println(solution(5));
        for (int i = 1; i <= 5; i++) {
            System.out.print(solution(i) + ", ");
        }
    }

    public static int solution(int n) {
        if(n <= 2) return 1;
        return solution(n - 1) + solution(n - 2);
    }
}
