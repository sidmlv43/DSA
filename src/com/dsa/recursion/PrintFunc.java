package com.dsa.recursion;

public class PrintFunc {
    static void main() {
        printNto1(5);
        System.out.println("_______________________________");
        System.out.println("_________END OF PROGRAM________");
        System.out.println("-------------------------------");
        print1toN(5);
    }

    public static void printNto1(int n) {
        if(n == 0) return;
        System.out.println(n);
        printNto1(n - 1);
    }

    public static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.println(n);
    }
}
