package threeHundredEightySeven_firstUniqueCharacterInString;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int firstUniqChar(String s) {
        Map<Character, Integer> charToCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charToCount.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
