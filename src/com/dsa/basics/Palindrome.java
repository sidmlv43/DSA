package com.dsa.basics;

public class Palindrome {
    static void main() {
        int n = 1201;
        System.out.println(solution(n));
        String s = "Racecr";
        System.out.println(solution(s));
    }

    public static boolean solution(int n) {
        int x = n;
        int rev = 0;

        while (x > 0){
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        return n == rev;
    }

    public static boolean solution(String str) {
        str = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
