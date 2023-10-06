package fourHundredThirtyEight_allAnagramsInString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramsInString {

    // Time complexity: O(n)
    // Space complexity: O(1) - because maps can only store a maximum of 26 keys
    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return new ArrayList<>();
        }

        Map<Character, Integer> charCountP = new HashMap<>();
        Map<Character, Integer> charCountWindow = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // get char count of p
        for (char c : p.toCharArray()) {
            charCountP.put(c, charCountP.getOrDefault(c, 0) + 1);
        }

        int windowLength = p.length();
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char charAtRight = s.charAt(right);
            // add rightmost char to window
            charCountWindow.put(charAtRight, charCountWindow.getOrDefault(charAtRight, 0) + 1);

            // once window is complete
            if (right - left == windowLength - 1) {
                // check if char counts are equal
                if (charCountWindow.equals(charCountP)) {
                    result.add(left);
                }

                // remove or reduce leftmost char from window
                char charAtLeft = s.charAt(left);
                if (charCountWindow.get(charAtLeft) == 1) {
                    charCountWindow.remove(charAtLeft);
                } else {
                    charCountWindow.put(charAtLeft, charCountWindow.get(charAtLeft) - 1);
                }

                left++;
            }

            right++;
        }

        return result;
    }
}
