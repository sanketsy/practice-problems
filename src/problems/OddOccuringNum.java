package problems;

public class OddOccuringNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 2, 2, 4, 5, 5, 4};
        int oddOccurring = 0;

        /**
         * XORing with self gives 0 and XORing with 0 gives self,
         * so all even nums negect each other remains 0 at the end and odd 3 XORed with 0 remains itself.
         */
        for (int num : arr) {
            oddOccurring = oddOccurring ^ num;
        }

        System.out.println(oddOccurring);
    }
}
