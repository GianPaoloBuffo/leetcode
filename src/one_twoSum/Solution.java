package one_twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { i, numToIndex.get(complement) };
            }
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
}
