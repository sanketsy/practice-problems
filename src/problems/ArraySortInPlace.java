package problems;

import java.util.Arrays;

public class ArraySortInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] solve(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (i >= j) {
                return arr;
            }
            swap(arr, i, j);
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        arr[j] = arr[i] + arr[j];
    }
}
