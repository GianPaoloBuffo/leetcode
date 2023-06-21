package fourHundredNine_longestPalindrome;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int longestPalindrome(String s) {
        int longest = 0;
        Set<Character> characters = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!characters.add(c)) {
                longest += 2;
                characters.remove(c);
            }
        }

        if (longest < s.length())
            longest++;

        return longest;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
