package leetcode.twoHundredThirtyEight_productOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void testCaseOne() {
        // given
        var nums = new int[]{1, 2, 3, 4};

        // when
        var result = new ProductOfArrayExceptSelf().productExceptSelf(nums);

        // then
        var expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, result);
    }

    @Test
    void testCaseTwo() {
        // given
        var nums = new int[]{-1, 1, 0, -3, 3};

        // when
        var result = new ProductOfArrayExceptSelf().productExceptSelf(nums);

        // then
        var expected = new int[]{0, 0, 9, 0, 0};
        assertArrayEquals(expected, result);
    }

}
