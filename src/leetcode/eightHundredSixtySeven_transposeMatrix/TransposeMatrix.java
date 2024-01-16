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
        var result = new int[matrix[0].length][matrix.length];

        for (var row = 0; row < matrix.length; row++) {
            for (var col = 0; col < matrix[row].length; col++) {
                result[col][row] = matrix[row][col];
            }
        }

        return result;
    }
}
