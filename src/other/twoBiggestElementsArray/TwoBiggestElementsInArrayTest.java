package other.twoBiggestElementsArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoBiggestElementsInArrayTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int[] nums, int[] expected) {
        // when
        var result = new TwoBiggestElementsInArray().twoBiggestElementsInArray(nums);

        // then
        assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCasesUsingStream(int[] nums, int[] expected) {
        // when
        var result = new TwoBiggestElementsInArray().twoBiggestElementsInArrayUsingStreams(nums);

        // then
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1}, new int[]{1, 1}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 3}),
                Arguments.of(new int[]{1, 2, 2, 3}, new int[]{2, 3}),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{5, 4, 3, 4, 5}, new int[]{4, 5}),
                Arguments.of(new int[]{5, 4, 3}, new int[]{4, 5})
        );
    }
}