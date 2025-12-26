package com.dsa.recursion;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int[] n = {5, 4, 3, 2, 1};
        solution(n, 0, n.length - 1);
        System.out.println(Arrays.toString(n));
    }

    public static void solution(int[] arr, int si, int ei) {
        if(si >= ei) return;
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        solution(arr, ++si, --ei);
    }
}
