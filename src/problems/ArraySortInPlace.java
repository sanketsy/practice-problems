package problems;

import utils.SwapUtil;

import java.util.Arrays;

public class ArraySortInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void solve(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (i >= j) {
                return;
            }
            SwapUtil.swapInPlace(arr, i, j);
        }
    }
}
