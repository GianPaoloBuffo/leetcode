package other.minimumSwaps;

import java.util.HashMap;

public class MinimumSwaps {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int minimumSwaps(int[] arr) {
        var originalPositions = new HashMap<Integer, Integer>();
        for (var i = 0; i < arr.length; i++) {
            originalPositions.put(arr[i], i);
        }

        var swaps = 0;
        for (var i = 0; i < arr.length; i++) {
            var correctValue = i + 1;

            if (arr[i] != correctValue) {
                swaps++;

                var temp = arr[i];
                arr[i] = correctValue;
                arr[originalPositions.get(correctValue)] = temp;

                originalPositions.put(temp, originalPositions.get(correctValue));
            }
        }

        return swaps;
    }
}
