package other.twoBiggestElementsArray;

import java.util.Arrays;

public class TwoBiggestElementsInArray {

    /*
     * One option is to sort and get the two elements from the end, but this is O(n log n) time complexity
     */

    // Time Complexity: O(n)
    public int[] twoBiggestElementsInArray(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("nums should have at least two elements");
        }

        var largest = Math.max(nums[0], nums[1]);
        var secondLargest = Math.min(nums[0], nums[1]);

        for (var i = 2; i < nums.length; i++) {
            var num = nums[i];

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return new int[]{secondLargest, largest};
    }

    /**
     * Another option is to use Streams, let's try that as well
     * This requires two passes over array.
     * Could get it done with reduce in one pass though
     */
    public int[] twoBiggestElementsInArrayUsingStreams(int[] nums) {
        var largest = Arrays.stream(nums).max().getAsInt();
        var secondLargest = Arrays.stream(nums).filter(n -> n != largest).max().orElse(largest);

        return new int[]{secondLargest, largest};
    }
}
