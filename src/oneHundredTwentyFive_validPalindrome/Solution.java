package oneHundredTwentyFive_validPalindrome;

public class Solution {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !isAlphaNumeric(s.charAt(l))) l++;
            while (r > l && !isAlphaNumeric(s.charAt(r))) r--;

            if (s.charAt(l) != s.charAt(r)) return false;

            l++;
            r--;
        }

        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        return c >= 'a' && c <= 'z' ||
                c >= 'A' && c <= 'Z' ||
                c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));
    }
}
