package com.dsa.basics;

public class GCD {
    static void main() {
        System.out.println(solution(-15, 20));
    }

    public static int solution(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
