package leetcode.twoHundredFifteen_kthLargestElementInArray;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class KthLargestElementInArray {

    /**
     * Given an integer array nums and an integer k, return the kth largest element in the array.
     * <p>
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * <p>
     * Can you solve it without sorting?
     * <p>
     * Example 1:
     * Input: nums = [3,2,1,5,6,4], k = 2
     * Output: 5
     * <p>
     * Example 2:
     * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
     * Output: 4
     * <p>
     * Constraints:
     * 1 <= k <= nums.length <= 105
     * -104 <= nums[i] <= 104
     */

    /**
     * Max Heap:
     * Time complexity: O(n log n)
     */
    public int findKthLargestMaxHeap(int[] nums, int k) {
        var maxHeap = new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a));

        for (var num : nums) {
            maxHeap.add(num);
        }

        for (var i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.poll();
    }

    /**
     * Sorting:
     * Time complexity: O(n log n)
     */
    public int findKthLargestSorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /**
     * Quick Select:
     * Avg time complexity: O(n)
     * Worst case time complexity: O(n^2)
     */
    public int findKthLargestQuickSelect(int[] nums, int k) {
        var targetIndex = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, targetIndex);
    }

    private int quickSelect(int[] nums, int l, int r, int targetIndex) {
        var randomIndex = new Random().nextInt(l, r + 1);
        swap(nums, randomIndex, r);

        var pivotValue = nums[r];
        var pivotPointer = l;

        for (var i = l; i < r; i++) {
            if (nums[i] <= pivotValue) {
                swap(nums, i, pivotPointer);
                pivotPointer++;
            }
        }

        swap(nums, r, pivotPointer);

        if (targetIndex < pivotPointer) {
            return quickSelect(nums, l, pivotPointer - 1, targetIndex);
        } else if (targetIndex > pivotPointer) {
            return quickSelect(nums, pivotPointer + 1, r, targetIndex);
        }

        return nums[pivotPointer];
    }

    private void swap(int[] nums, int firstIndex, int secondIndex) {
        var temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}
