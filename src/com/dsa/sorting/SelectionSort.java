package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] n = {1, 4, 2, 1, 0};
        solution(n);
        System.out.println(Arrays.toString(n));
    }

    public static void solution(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIdx = i;

            for (int j = i; j < n; j++) {
                if(arr[j] < arr[i]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
