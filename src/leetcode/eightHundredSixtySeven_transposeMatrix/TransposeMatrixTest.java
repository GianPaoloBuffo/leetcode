package leetcode.eightHundredSixtySeven_transposeMatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int[][] matrix, int[][] expected) {
        // when
        var result = new TransposeMatrix().transpose(matrix);

        // then
        for (var i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}),
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{1, 4}, {2, 5}, {3, 6}})
        );
    }
}