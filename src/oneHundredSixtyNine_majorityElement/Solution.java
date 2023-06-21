package oneHundredSixtyNine_majorityElement;

public class Solution {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int result = nums[0];

        for (int num : nums) {
            if (count == 0)
                result = num;

            if (result == num)
                count++;
            else
                count--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
