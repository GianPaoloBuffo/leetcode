package other.countHillsAndValleys;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountHillsAndValleysTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int[] heights, int expected) {
        // when
        var result = new CountHillsAndValleys().countHillsAndValleys(heights);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 3, 3, 2, 2, 1, 1}, 3),
                Arguments.of(new int[]{1, 2}, 2),
                Arguments.of(new int[]{1, 2, 3}, 2),
                Arguments.of(new int[]{3, 2, 1}, 2)
        );
    }
}