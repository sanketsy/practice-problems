package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Check if two arrays are rotations of each other
 */

public class IsARotationOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 1, 2, 3};
        System.out.println(solve(arr1, arr2));
    }

    static boolean solve(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int nextIndex = i == arr1.length - 1 ? 0 : i + 1;
            map.put(arr1[i], arr1[nextIndex]);
        }

        for (int i = 0; i < arr2.length - 1; i++) {
            if (map.getOrDefault(arr2[i], Integer.MIN_VALUE) != arr2[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
