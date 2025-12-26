package com.dsa.basics;

import java.util.ArrayList;
import java.util.List;

public class Divisors {
    static void main() {
       int x = 31;
        System.out.println(solution(x));
    }

    public static List<Integer> solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                divisors.add(i);
                if(i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
