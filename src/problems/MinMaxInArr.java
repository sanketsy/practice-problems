package problems;

public class MinMaxInArr {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 22, 7};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        System.out.println("Min: " + min + ", Max: " + max);
    }
}
