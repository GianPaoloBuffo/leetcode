package other.maximumSumFixedSizeSubarray;

public class MaximumSumFixedSizeSubarray {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int getMaxSumSubarrayLength(int[] arr, int size) {
        if (size > arr.length) {
            throw new IllegalArgumentException("size " + size + " is greater than array length " + arr.length);
        }

        var maxSum = 0;
        for (var i = 0; i < size; i++) {
            maxSum += arr[i];
        }

        var windowSum = maxSum;
        for (var i = size; i < arr.length; i++) {
            windowSum -= arr[i - size];
            windowSum += arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
