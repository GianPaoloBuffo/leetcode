package leetcode.eightHundredSixtySeven_transposeMatrix;

public class TransposeMatrix {

    /**
     * Given a 2D integer array matrix, return the transpose of matrix.
     * <p>
     * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
     * <p>
     * Example 1:
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[1,4,7],[2,5,8],[3,6,9]]
     * <p>
     * Example 2:
     * Input: matrix = [[1,2,3],[4,5,6]]
     * Output: [[1,4],[2,5],[3,6]]
     * <p>
     * Time Complexity: O(nm)
     */
    public int[][] transpose(int[][] matrix) {
        var n = matrix.length;
        var m = matrix[0].length;
        var result = new int[m][n];

        for (var col = 0; col < n; col++) {
            for (var row = 0; row < m; row++) {
                result[row][col] = matrix[col][row];
            }
        }

        return result;
    }
}
