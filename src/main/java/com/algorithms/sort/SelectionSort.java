package com.algorithms.sort;

import com.algorithms.utils.PrintUtils;
import com.algorithms.utils.SortUtils;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 10, 6};
        sort(arr);
        PrintUtils.printArr(arr);
    }

    public static void sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                SortUtils.swap(arr, min, i);
            }
        }
    }
}
