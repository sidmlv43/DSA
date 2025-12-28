package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeSort {
    static void main() {
        int[] arr = {5, 4, 1, 7, 6, 2, 4};
        solution(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void solution(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        solution(arr,si, mid);
        solution(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        // Create temp array
        List<Integer> temp = new ArrayList<>();
        int left = si, right = mid + 1;

        // merge sorted parts
        while (left <= mid && right <= ei) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            }else {
                temp.add(arr[right++]);
            }
        }

        // add remaining elements;
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= ei) {
            temp.add(arr[right++]);
        }

        // Copy back to original array
        for (int i = si; i <= ei; i++)
            arr[i] = temp.get(i - si);
    }
}
