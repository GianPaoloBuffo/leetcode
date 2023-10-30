package one_twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void testCaseOne() {
        // given
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;

        // when
        var result = new TwoSum().twoSum(nums, target);

        // then
        var expected = new int[]{0, 1};

        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    void testCaseTwo() {
        // given
        var nums = new int[]{3, 2, 4};
        var target = 6;

        // when
        var result = new TwoSum().twoSum(nums, target);

        // then
        var expected = new int[]{1, 2};

        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    void testCaseThree() {
        // given
        var nums = new int[]{3, 3};
        var target = 6;

        // when
        var result = new TwoSum().twoSum(nums, target);

        // then
        var expected = new int[]{0, 1};

        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}
