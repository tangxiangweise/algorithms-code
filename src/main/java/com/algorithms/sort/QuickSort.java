package com.algorithms.sort;

import com.algorithms.utils.PrintUtils;
import com.algorithms.utils.SortUtils;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 10, 6};
        sort(arr, 0, arr.length - 1);
        PrintUtils.printArr(arr);
    }

    /**
     * 时间复杂度：  O(N*logN)
     *
     * @param arr
     * @param leftBound
     * @param rightBound
     */
    public static void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) return;
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid + 1, rightBound);
    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            // 从左至右定位比pivot大的数角标
            while (left <= right && arr[left] <= pivot) left++;
            // 从右至左定位比pivot小的数角标
            while (left <= right && arr[right] > pivot) right--;
            System.out.println("before swap left -> " + left + " right -> " + right);
            if (left < right) SortUtils.swap(arr, left, right);
            PrintUtils.printArr(arr);
        }
        // 把比较值放入数组中间位置
        SortUtils.swap(arr, left, rightBound);
        return left;
    }


}
