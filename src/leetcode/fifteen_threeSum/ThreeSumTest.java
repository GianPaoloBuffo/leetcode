package leetcode.fifteen_threeSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int[] nums, List<List<Integer>> expected) {
        // when
        var result = new ThreeSum().threeSum(nums);

        // then
        assertEquals(expected.size(), result.size());
        result.forEach(e -> assertTrue(expected.stream().anyMatch(e::containsAll)));
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0)))
        );
    }
}