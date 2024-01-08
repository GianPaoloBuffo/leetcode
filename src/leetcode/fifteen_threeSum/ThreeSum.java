package leetcode.fifteen_threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * <p>
     * Notice that the solution set must not contain duplicate triplets.
     * <p>
     * Example 1:
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     * <p>
     * Example 3:
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     * <p>
     * Time Complexity: O(n^2)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();

        // 1. Sort array
        Arrays.sort(nums);

        // 2. Iterate through nums, use each num as "anchor", remember to avoid duplicates
        for (var i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            var left = i + 1;
            var right = nums.length - 1;
            while (left < right) {
                var threeSum = nums[i] + nums[left] + nums[right];

                if (threeSum > 0) {
                    right--;
                } else if (threeSum < 0) {
                    left++;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));

                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}
