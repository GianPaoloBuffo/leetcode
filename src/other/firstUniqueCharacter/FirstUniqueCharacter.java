package other.firstUniqueCharacter;

import java.util.HashMap;

public class FirstUniqueCharacter {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int firstUniqChar(String s) {
        var charCount = new HashMap<Character, Integer>();
        char[] charArray = s.toCharArray();

        for (var c : charArray) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < charArray.length; i++) {
            var c = charArray[i];

            if (charCount.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
