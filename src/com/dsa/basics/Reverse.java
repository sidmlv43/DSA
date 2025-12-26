package com.dsa.basics;

public class Reverse {
    void main() {
        System.out.println("Hello World");
        int n = -1203;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
