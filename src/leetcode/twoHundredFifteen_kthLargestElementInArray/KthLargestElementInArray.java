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
     * Sorting:
     * Time complexity: O(n log n)
     */
    public int findKthLargestSorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

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
     * Quick Select:
     * Avg time complexity: O(n)
     * Worst case time complexity: O(n^2)
     */
    public int findKthLargestQuickSelect(int[] nums, int k) {
        var targetIndex = nums.length - k;
        return quickSelect(nums, targetIndex, 0, nums.length - 1);
    }

    private int quickSelect(int[] nums, int targetIndex, int l, int r) {
        var randomIndex = new Random().nextInt(l, r + 1);
        swap(nums, randomIndex, r);

        var pivotValue = nums[r];
        var pivotIndex = l;

        for (var i = l; i < r; i++) {
            if (nums[i] <= pivotValue) {
                swap(nums, i, pivotIndex);
                pivotIndex++;
            }
        }

        swap(nums, pivotIndex, r);

        if (targetIndex > pivotIndex) {
            return quickSelect(nums, targetIndex, pivotIndex + 1, r);
        }
        if (targetIndex < pivotIndex) {
            return quickSelect(nums, targetIndex, l, pivotIndex - 1);
        }

        return nums[pivotIndex];
    }

    private void swap(int[] nums, int leftIndex, int rightIndex) {
        var temp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = temp;
    }
}
