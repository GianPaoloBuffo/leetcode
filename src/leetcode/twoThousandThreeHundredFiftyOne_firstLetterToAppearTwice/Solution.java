package leetcode.twoThousandThreeHundredFiftyOne_firstLetterToAppearTwice;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static char repeatedCharacter(String s) {
        Set<Character> unique = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (unique.contains(c)) {
                return c;
            }
            unique.add(c);
        }

        throw new IllegalArgumentException("s should have at least one repeating character");
    }
}
