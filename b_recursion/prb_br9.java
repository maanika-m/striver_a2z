import java.util.Scanner;

class prb_br9 {

    /*
        Started from the recursive array-reversal idea:
        take the two ends, swap them, move inward.

        The goal here is not to be fancy.
        Just keep the same reversal pattern and use it on the string.
    */
    static void rPalindrome(char A[], int start, int end) {

        // When the pointers meet or cross, there is nothing left to swap.
        if (start >= end) {
            return;
        }

        // Standard swap, same as the array reversal problem.
        char temp = A[start];
        A[start] = A[end];
        A[end] = temp;

        // Keep moving inward.
        rPalindrome(A, start + 1, end - 1);
    }

    /*
        This is the stage after reversal.

        First make the string usable.
        Then reverse it.
        Then compare it with the cleaned original.
    */
    static boolean comparePalindrome(String s) {

        // Convert string into a form I can work on directly.
        char A[] = s.toCharArray();

        // Recursively reverse the character array.
        rPalindrome(A, 0, s.length() - 1);

        // Turn the reversed array back into a string.
        String reversed = new String(A);

        // Final check.
        return reversed.equals(s);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take the input as a whole string.
        String s = scanner.next();

        /*
            Clean it first:
            lowercase it and remove everything that should not matter.
        */
        s = s.toLowerCase().replaceAll("[^a-z0-9] ", "");

        // Get the answer from the comparison method.
        boolean result = comparePalindrome(s);

        // Print the final verdict.
        if (result == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}