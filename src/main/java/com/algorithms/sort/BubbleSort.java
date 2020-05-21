package com.algorithms.sort;

import com.algorithms.utils.PrintUtils;
import com.algorithms.utils.SortUtils;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 10, 6};
        sort(arr);
        PrintUtils.printArr(arr);
    }

    /**
     * 时间复杂度 O(n^2)
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void markSort(int[] arr) {
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap(arr, j, j + 1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }


}
