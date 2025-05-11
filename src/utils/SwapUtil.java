package utils;

public class SwapUtil {
    public static void swapInPlace(int[] arr, int i, int j) {
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        arr[j] = arr[i] + arr[j];
    }

    /**
     * XORing with same number twice retains the original number
     */
    public static void swapXor(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
