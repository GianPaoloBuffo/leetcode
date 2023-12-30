package leetcode.sevenHundredFour_binarySearch;

public class Solution {

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int middle = (l + r) / 2;
            int num = nums[middle];
            if (num == target)
                return middle;
            if (num < target)
                l = middle + 1;
            else
                r = middle - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1};
        System.out.println(search(nums, 1));
    }
}
