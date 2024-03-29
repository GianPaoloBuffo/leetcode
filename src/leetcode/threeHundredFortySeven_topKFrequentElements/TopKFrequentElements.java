package leetcode.threeHundredFortySeven_topKFrequentElements;

/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Map num to frequency
        var numToFrequency = new HashMap<Integer, Integer>();
        for (var num : nums) {
            numToFrequency.put(num, numToFrequency.getOrDefault(num, 0) + 1);
        }

        // 2. Create list where index is frequency, and value is list of nums with that frequency
        var numsIndexedByFrequency = new ArrayList<List<Integer>>(nums.length + 1);
        for (var i = 0; i <= nums.length; i++) {
            numsIndexedByFrequency.add(new ArrayList<>());
        }

        for (var entry : numToFrequency.entrySet()) {
            var num = entry.getKey();
            var frequency = entry.getValue();
            numsIndexedByFrequency.get(frequency).add(num);
        }

        // 3. Iterate from end of list (most frequency) until k values are in result
        var result = new ArrayList<Integer>();
        for (var i = nums.length; i >= 0; i--) {
            if (result.size() == k) {
                break;
            }

            result.addAll(numsIndexedByFrequency.get(i));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
