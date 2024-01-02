package leetcode.oneHundredTwentyEight_longestConsecutiveSequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    /**
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
     * You must write an algorithm that runs in O(n) time.

     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.

     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int longestConsecutive(int[] nums) {
        var longestSubsequence = 0;

        var numSet = new HashSet<Integer>();
        for (var num : nums) {
            numSet.add(num);
        }

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // if true, num is first element of a subsequence (set contains is O(1))
                var consecutiveCount = 0;
                while (numSet.contains(num + consecutiveCount)) {
                    consecutiveCount++;
                }
                longestSubsequence = Math.max(longestSubsequence, consecutiveCount);
            }
        }

        return longestSubsequence;
    }
}
