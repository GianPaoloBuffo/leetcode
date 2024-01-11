package other.countHillsAndValleys;

public class CountHillsAndValleys {

    public int countHillsAndValleys(int[] heights) {
        var count = 1;
        var direction = 0; // -1: down, 0: flat, 1: up
        var i = 1;

        while (i < heights.length) {
            // Skip segments with same height
            while (i < heights.length && heights[i] == heights[i - 1]) {
                i++;
            }

            // Check if a hill or valley
            if (i < heights.length) {
                var newDirection = heights[i] > heights[i - 1] ? 1 : -1;
                if (newDirection != direction) {
                    count++;
                    direction = newDirection;
                }
            }

            i++;
        }

        return count;
    }
}
