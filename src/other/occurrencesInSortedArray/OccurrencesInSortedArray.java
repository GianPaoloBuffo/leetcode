package other.occurrencesInSortedArray;

public class OccurrencesInSortedArray {

    // Binary Search
    // Time Complexity: O(log n)
    // Space complexity: O(1)
    public static int countOccurrences(int[] arr, int target) {
        var leftIndex = binarySearch(arr, target, true);
        if (leftIndex < 0) {
            return 0;
        }

        var rightIndex = binarySearch(arr, target, false);
        return rightIndex - leftIndex + 1;
    }

    private static int binarySearch(int[] arr, int target, boolean searchLeftmost) {
        var left = 0;
        var right = arr.length - 1;
        var index = -1;

        while (left <= right) {
            var mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                index = mid;

                if (searchLeftmost) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }
}
