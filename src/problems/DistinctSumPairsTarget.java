package problems;

import java.util.*;


public class DistinctSumPairsTarget {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 4};
        int target = 8;

        solve1(arr, target);
    }

    static void solve1(int[] arr, int target) {
        Set<List<Integer>> pairs = new HashSet<>();
        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (
                    complement == arr[i] &&
                            visited.getOrDefault(complement, 0) == 1
            ) {
                pairs.add(Arrays.asList(arr[i], arr[i]));
            }
            else if (
                    visited.getOrDefault(complement, 0) > 0
                            && visited.getOrDefault(arr[i], 0) == 0
            ) {
                int num1 = Math.min(arr[i], complement);
                int num2 = Math.max(arr[i], complement);
                pairs.add(Arrays.asList(num1, num2));
            }

            visited.put(arr[i], visited.getOrDefault(arr[i], 0) + 1);

        }

        System.out.println(pairs);
    }

    static void solveBasic(int[] arr, int target) {
        Set<List<Integer>> pair = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int num1 = Math.min(arr[i], arr[j]);
                    int num2 = Math.max(arr[i], arr[j]);
                    pair.add(Arrays.asList(num1, num2));
                }
            }
        }

        System.out.println(pair);
    }
}
