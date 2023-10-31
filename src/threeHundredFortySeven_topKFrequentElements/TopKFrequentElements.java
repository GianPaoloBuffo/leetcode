package threeHundredFortySeven_topKFrequentElements;

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
import java.util.Map;

public class TopKFrequentElements {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numToCount = new HashMap<>();
        for (int num : nums) {
            numToCount.put(num, numToCount.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> occurrencesToValues = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length + 1; i++) {
            occurrencesToValues.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> numCount : numToCount.entrySet()) {
            Integer occurrences = numCount.getValue();
            List<Integer> existing = occurrencesToValues.get(occurrences);
            existing.add(numCount.getKey());
        }

        List<Integer> result = new ArrayList<>();
        for (int i = occurrencesToValues.size() - 1; i >= 0; i--) {
            if (result.size() == k) {
                break;
            }
            result.addAll(occurrencesToValues.get(i));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
