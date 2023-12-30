package leetcode.twoHundredFortyTwo_validAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testCaseOne() {
        // given
        var s = "anagram";
        var t = "nagaram";

        // when
        var result = new ValidAnagram().isAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void testCaseTwo() {
        // given
        var s = "rat";
        var t = "car";

        // when
        var result = new ValidAnagram().isAnagram(s, t);

        assertFalse(result);
    }
}