package problems;

import utils.SwapUtil;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 3, 0, 0, 4, 5, 0, 6, 7, 0, 8, 0};

        solve1(arr);
        solve2(arr);
    }

    /**
     * My Solution
     */
    static void solve1(int[] arr) {
        int zerothIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] != 0) {
                int index = zerothIndex != -1 ? zerothIndex : i;
                SwapUtil.swapInPlace(arr, index, i + 1);
                if (zerothIndex != -1) {
                    zerothIndex++;
                }
            }

            if (arr[i] == 0 && arr[i + 1] == 0 && zerothIndex == -1) {
                zerothIndex = i;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Best solution
     */
    static void solve2(int[] arr) {
        int zerothIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                SwapUtil.swap(arr, i, zerothIndex);
                zerothIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
