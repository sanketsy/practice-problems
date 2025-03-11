package problems;

/**
 * Check if two string are rotations of each other
 */
public class IsRotationOfString {
    public static void main(String[] args) {
        String str1 = "sanket";
        String str2 = "ketsan";
        System.out.println(solve(str1, str2));
    }

    static boolean solve(String str1, String str2) {
        String str = str1 + str1;
        return str.contains(str2);
    }
}
