package arrays;

import java.util.Arrays;

public class IsUnique {

    /* Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures? */

    /* Making the assumption that the string consists only of lower case english alphabetical characters - ASCII */

    /* O(n) - time */
    /* O(1) - space as it's always 26 bucket long array */
    public static boolean isUniqueWithHelperArray(char[] str) {

        if (str.length > 26) {
            return false;
        }

        int[] alphabet = new int[26];

        for (int i = 0; i < str.length; i++) {
            if(alphabet[str[i] - 'a']++ == 1) {
                return false;
            }
        }

        return true;
    }

    /* O(nlongn) - time using a sorting algorithm that doesn't utilise extra space */
    /* O(1) - space */
    public static boolean isUniqueSorting(char[] str) {

        if (str.length > 26) {
            return false;
        }

        Arrays.sort(str);

        for (int i = 0; i < str.length-1; i++) {
            if (str[i] == str[i+1]) {
                return false;
            }
        }

        return true;
    }
}
