package twoHundredSeventeen_containsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {


    @Test
    void testCaseOne() {
        // given
        var nums = new int[]{1, 2, 3, 1};

        // when
        var result = new ContainsDuplicate().containsDuplicate(nums);

        // then
        assertTrue(result);
    }

    @Test
    void testCaseTwo() {
        // given
        var nums = new int[]{1, 2, 3, 4};

        // when
        var result = new ContainsDuplicate().containsDuplicate(nums);

        // then
        assertFalse(result);
    }

    @Test
    void testCaseThree() {
        // given
        var nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        // when
        var result = new ContainsDuplicate().containsDuplicate(nums);

        // then
        assertTrue(result);
    }
}