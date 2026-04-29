//given a number in the form of an array from 1 to 9.
// find the next smallest pallindrome strictly larger than the given number.

import java.util.*;
public class Next_Palindrome {
    public static int[] nextPalindrome(int[] num) {
        int n = num.length;

        //CASE 1: All 9s
        if (isAllNines(num)) {
            int[] result = new int[n + 1];
            result[0] = 1;
            result[n] = 1;          
            return result;
        }

        // CASE 2: General case
        int[] palindrome = Arrays.copyOf(num, n);
        mirrorLeftToRight(palindrome);
        if (isGreater(palindrome, num)) {
            return palindrome;
        }
        incrementMiddle(palindrome);

        return palindrome;
    }

    // All digits 9?
    private static boolean isAllNines(int[] num) {
        for (int d : num)
            if (d != 9) return false;
        return true;
    }

    // Copy left half → right half
    private static void mirrorLeftToRight(int[] num) {
        int n = num.length;
        for (int i = 0; i < n / 2; i++)
            num[n - 1 - i] = num[i];
    }

    // Is arr1 strictly greater than arr2? (same length)
    private static boolean isGreater(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) return true;
            if (arr1[i] < arr2[i]) return false;
        }
        return false;
    }

    //Add 1 to the middle digit(s), carry leftward, then re-mirror
    private static void incrementMiddle(int[] num) {
        int n   = num.length;
        int mid = n / 2;

        // Odd length  → start at exact middle index
        // Even length → start at (mid - 1), i.e. left-center digit
        int i     = (n % 2 == 0) ? mid - 1 : mid;
        int carry = 1;

        while (i >= 0 && carry > 0) {
            num[i] += carry;
            carry   = num[i] / 10;
            num[i] %= 10;
            i--;
        }

        mirrorLeftToRight(num);
    }

    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int d : arr) sb.append(d).append(' ');
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        printArray(nextPalindrome(num));
        sc.close();
    }
}