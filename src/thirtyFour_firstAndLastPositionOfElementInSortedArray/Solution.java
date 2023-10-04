package thirtyFour_firstAndLastPositionOfElementInSortedArray;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        if (left < 0)
            return new int[] {-1,-1};

        int right = binarySearch(nums, target, false);
        return new int[] {left, right};
    }

    private int binarySearch(int[] nums, int target, boolean leftMost) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (leftMost) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }
}
