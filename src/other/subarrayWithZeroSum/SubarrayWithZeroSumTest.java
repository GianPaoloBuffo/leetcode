package other.subarrayWithZeroSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithZeroSumTest {

    @ParameterizedTest
    @MethodSource("subarrayWithZeroSumTestData")
    void shouldReturnWhetherAZeroSumSubarrayExists(int[] arr, boolean expectedResult) {
        // when
        var result = new SubarrayWithZeroSum().containsSubarrayWithZeroSum(arr);

        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> subarrayWithZeroSumTestData() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, -3, 1, 6}, true),
                Arguments.of(new int[]{4, 2, 0, 1, 6}, true),
                Arguments.of(new int[]{-3, 2, 3, 1, 6}, false)
        );
    }
}
