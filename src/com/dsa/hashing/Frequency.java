package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    static void main() {
        int[] n = {10,5,10,15,10,5};
        solution(n);
    }

    public static void solution(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n: arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        System.out.println(freq);
    }
}
