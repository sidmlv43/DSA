package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] n = {1, 4, 2, 1, 0};
        solution(n);
        System.out.println(Arrays.toString(n));
    }

    public static void solution(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
