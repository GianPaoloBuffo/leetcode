package other.alternatingSort;

import java.util.Arrays;

public class AlternatingSort {

    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public void printArrayWithAlternatingSort(int[] arr) {
        Arrays.sort(arr);

        var left = 0;
        var right = arr.length - 1;

        while (left < right) {
            System.out.print(arr[right--] + " ");
            System.out.print(arr[left++] + " ");
        }

        if (arr.length % 2 != 0) {
            System.out.print(arr[left]);
        }
    }
}
