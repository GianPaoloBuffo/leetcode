package leetcode.sevenHundredThree_kthLargestElementInStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInStreamTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int k, int[] nums, int[] values, int expected) {
        // given
        var stream = new KthLargestElementInStream(k, nums);
        var result = Integer.MIN_VALUE;

        // when
        for (var val : values) {
            result = stream.add(val);
        }

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(3, new int[]{4, 5, 8, 2}, new int[]{3, 5, 10, 9, 4}, 8),
                Arguments.of(3, new int[]{4, 5}, new int[]{3, 5, 10, 9, 4}, 5),
                Arguments.of(3, new int[]{1, 2, 3, 4, 5}, new int[]{6}, 4)
        );
    }
}
