package leetcode.twenty_validParentheses;

import java.util.Map;
import java.util.Stack;

public class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> closingToOpening = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );

        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char parenthesis = s.charAt(i);

            if (closingToOpening.containsKey(parenthesis)) {
                if (!parentheses.empty() && closingToOpening.get(parenthesis) == parentheses.peek()) {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else {
                parentheses.push(parenthesis);
            }
        }

        return parentheses.empty();
    }
}
