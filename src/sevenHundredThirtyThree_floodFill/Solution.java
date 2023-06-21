package sevenHundredThirtyThree_floodFill;

import java.util.Arrays;

public class Solution {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if (color == originalColor)
            return image;

        image[sr][sc] = color;

        if (sc - 1 >= 0 && image[sr][sc - 1] == originalColor)
            floodFill(image, sr, sc - 1, color);
        if (sr - 1 >= 0 && image[sr - 1][sc] == originalColor)
            floodFill(image, sr - 1, sc, color);
        if (sc + 1 < image[sr].length && image[sr][sc + 1] == originalColor)
            floodFill(image, sr, sc + 1, color);
        if (sr + 1 < image.length && image[sr + 1][sc] == originalColor)
            floodFill(image, sr + 1, sc, color);

        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1},
                        {1, 1, 0},
                        {1, 0, 1}};

        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
    }
}
