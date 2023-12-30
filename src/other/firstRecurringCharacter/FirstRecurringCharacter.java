package other.firstRecurringCharacter;

import java.util.HashSet;

public class FirstRecurringCharacter {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static char repeatedCharacter(String s) {
        var uniqueCharacters = new HashSet<Character>();

        for (var c : s.toCharArray()) {
            if (!uniqueCharacters.add(c)) {
                return c;
            }
        }

        throw new IllegalArgumentException("There should be a repeated character");
    }
}
