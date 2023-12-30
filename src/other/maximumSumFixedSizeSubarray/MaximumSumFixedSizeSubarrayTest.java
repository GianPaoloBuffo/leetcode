package other.maximumSumFixedSizeSubarray;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumFixedSizeSubarrayTest {

    @ParameterizedTest
    @MethodSource("maximumSumFixedSizeSubarrayTestData")
    void shouldCalculateExpectedMaxSumWithValidInput(int[] arr, int size, int expectedMaxSum) {
        // when
        var result = new MaximumSumFixedSizeSubarray().getMaxSumSubarrayLength(arr, size);

        // then
        assertEquals(result, expectedMaxSum);
    }

    @Test
    void shouldThrowExceptionWhenSubarrayIsLargerThanArray() {
        // given
        var arr = new int[]{2, 3};
        var size = 3;

        // when-then
        assertThrows(IllegalArgumentException.class, () -> new MaximumSumFixedSizeSubarray().getMaxSumSubarrayLength(arr, size));
    }

    private static Stream<Arguments> maximumSumFixedSizeSubarrayTestData() {
        return Stream.of(
                Arguments.of(new int[]{100, 200, 300, 400}, 2, 700),
                Arguments.of(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4, 39)
        );
    }
}
