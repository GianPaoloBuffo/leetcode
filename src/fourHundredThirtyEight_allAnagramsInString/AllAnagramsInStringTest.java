package fourHundredThirtyEight_allAnagramsInString;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AllAnagramsInStringTest {

    @Test
    void testCaseOne() {
        // given
        var s = "cbaebabacd";
        var p = "abc";

        // when
        var result = AllAnagramsInString.findAnagrams(s, p);

        // then
        var expected = List.of(0, 6);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void testCaseTwo() {
        // given
        var s = "abab";
        var p = "ab";

        // when
        var result = AllAnagramsInString.findAnagrams(s, p);

        // then
        var expected = List.of(0, 1, 2);
        assertArrayEquals(expected.toArray(), result.toArray());
    }
}
