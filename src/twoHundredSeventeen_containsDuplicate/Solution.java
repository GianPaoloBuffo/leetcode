package twoHundredSeventeen_containsDuplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<>();

        for (int num : nums) {
            if (!distinct.add(num))
                return true;
        }

        return false;
    }
}
