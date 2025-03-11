package problems;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {6, 4, 5, 1, 2, 3};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
