package leetcode.threeHundredFortySeven_topKFrequentElements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void testCaseOne() {
        // given
        var nums = new int[] {1,1,1,2,2,3};
        var k = 2;

        // when
        var result = new TopKFrequentElements().topKFrequent(nums, k);

        // then
        var expected = new int[] {1, 2};
        Arrays.sort(result);
        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    void testCaseTwo() {
        // given
        var nums = new int[] {1};
        var k = 1;

        // when
        var result = new TopKFrequentElements().topKFrequent(nums, k);

        // then
        var expected = new int[] {1};
        assertArrayEquals(expected, result);
    }
}
