package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] n = {1, 4, 2, 1, 0};
        solution(n);
        System.out.println(Arrays.toString(n));

    }

    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]  > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
