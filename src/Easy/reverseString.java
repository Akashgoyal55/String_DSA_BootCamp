package Easy;

import java.util.Arrays;

public class reverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        reverseString solution = new reverseString();

        // Test Case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + Arrays.toString(s1));
        solution.reverseString(s1);
        System.out.println("Reversed: " + Arrays.toString(s1));

        // Test Case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("\nOriginal: " + Arrays.toString(s2));
        solution.reverseString(s2);
        System.out.println("Reversed: " + Arrays.toString(s2));
    }
}
