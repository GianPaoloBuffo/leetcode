package twoHundredFortyTwo_validAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> charToCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!charToCount.containsKey(c)) return false;
            if (charToCount.get(c) == 1) {
                charToCount.remove(c);
            } else {
                charToCount.put(c, charToCount.get(c) - 1);
            }
        }

        return charToCount.isEmpty();
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
