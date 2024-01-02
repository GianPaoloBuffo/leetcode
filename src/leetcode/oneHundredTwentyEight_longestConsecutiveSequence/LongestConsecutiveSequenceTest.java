package leetcode.oneHundredTwentyEight_longestConsecutiveSequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    @ParameterizedTest
    @MethodSource("longestConsecutiveSequenceTestData")
    void shouldReturnLongestConsecutiveSequence(int[] nums, int expected) {
        // when
        var result = new LongestConsecutiveSequence().longestConsecutive(nums);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> longestConsecutiveSequenceTestData() {
        return Stream.of(
                Arguments.of(new int[]{100, 4, 200, 1, 3, 2}, 4),
                Arguments.of(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1, 3, 5, 2, 4}, 5),
                Arguments.of(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}, 7)
        );
    }
}
