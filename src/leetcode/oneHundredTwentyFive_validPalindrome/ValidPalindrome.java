package leetcode.oneHundredTwentyFive_validPalindrome;

public class ValidPalindrome {

    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
     * non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     * <p>
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * <p>
     * Example 1:
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * <p>
     * Example 2:
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     * <p>
     * Example 3:
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing non-alphanumeric characters.
     * Since an empty string reads the same forward and backward, it is a palindrome.
     * <p>
     * Constraints:
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     */
    public boolean isPalindrome(String s) {
        var lowerS = s.toLowerCase();

        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            while (left < right && !isAlphanumeric(lowerS.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphanumeric(lowerS.charAt(right))) {
                right--;
            }

            if (lowerS.charAt(left) != lowerS.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphanumeric(char c) {
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}
