package problems;

import java.util.Arrays;

public class RotateKSteps {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        solve1(arr, k);
        solve2(arr, k);


    }

    /**
     * NAIVE: Just print last k elements then print 1st n-k elements
     * Little tricky check the indexes
     */
    static void solve2(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i < k) {
                System.out.print(arr[i + n - k] + " ");
            } else {
                System.out.print(arr[i - k] + " ");
            }
        }
    }

    /**
     * EXPECTED
     * Reverse first grp i.e. n-k elements
     * then Reverse last k elements
     * then Reverse whole arr and SOLVED
     */
    static void solve1(int[] arr, int k) {
        int n = arr.length;

        //i < (n - k) / 2 -> this could be loop condition but below is better
        for (int i = 0, j = n - k - 1; i < j; i++, j--) {
            swap(arr, i, j);
        }

        for (int i = n - k, j = n - 1; i < j; i++, j--) {
//            if (i >= j) {
//                break;
//            }
            swap(arr, i, j);
        }

        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            swap(arr, i, j);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        arr[j] = arr[i] + arr[j];
    }
}
