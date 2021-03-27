package arrays;

public class StringCompression {
    /* Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa
    * would become a2b1c5a3. If the compressed string is longer than the original one, we should return the original one
    * Assume char set is uppercase and lowercase a to z */

    public static String compress(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        char temp = str.charAt(0);
        int currCharCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == temp) {
                currCharCount++;
            } else {
                sb.append(str.charAt(i-1));
                sb.append(currCharCount);
                currCharCount = 1;
                temp = str.charAt(i);
            }
        }
        sb.append(temp);
        sb.append(currCharCount);

        return (str.length() < sb.length()) ? str : sb.toString();
    }
}
