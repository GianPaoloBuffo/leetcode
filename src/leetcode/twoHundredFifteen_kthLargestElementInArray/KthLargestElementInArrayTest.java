package leetcode.twoHundredFifteen_kthLargestElementInArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInArrayTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCasesSorting(int[] nums, int k, int expected) {
        // when
        var result = new KthLargestElementInArray().findKthLargestSorting(nums, k);

        // then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCasesMaxHeap(int[] nums, int k, int expected) {
        // when
        var result = new KthLargestElementInArray().findKthLargestMaxHeap(nums, k);

        // then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCasesQuickSelect(int[] nums, int k, int expected) {
        // when
        var result = new KthLargestElementInArray().findKthLargestQuickSelect(nums, k);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1, 5, 6, 4}, 2, 5),
                Arguments.of(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4),
                Arguments.of(new int[]{1}, 1, 1)
        );
    }
}