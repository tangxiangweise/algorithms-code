import com.algorithms.utils.PrintUtils;
import com.algorithms.utils.SortUtils;

public class SortTest {


    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 10, 6};
        quickSort(arr);
//        bubbleSort(arr);
//        selectionSort(arr);
        PrintUtils.printArr(arr);
    }


    public static void bubbleSort(int[] arr) {
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap(arr, i, j);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                SortUtils.swap(arr, i, min);
            }
        }
    }

    public static void instertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int pos = i;
            while (pos > 0 && arr[pos - 1] > value) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = value;
        }
    }

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) return;
        int mid = part(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid + 1, rightBound);
    }

    public static int part(int[] arr, int leftBound, int rightBound) {
        int value = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while (left <= right && arr[left] <= value) left++;
            while (left <= right && arr[right] > value) right--;
            if (left < right) SortUtils.swap(arr, left, right);
        }
        SortUtils.swap(arr, left, rightBound);
        return left;
    }


}
