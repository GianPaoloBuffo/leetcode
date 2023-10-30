package fortyNine_GroupAnagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void testCaseOne() {
        // given
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // when
        var result = new GroupAnagrams().groupAnagrams(strs);

        // then
        var expected = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        assertEquals(expected.size(), result.size());
        expected.forEach(e ->
                assertTrue(result.stream().anyMatch(e::containsAll))
        );
    }

    @Test
    void testCaseTwo() {
        // given
        String[] strs = {""};

        // when
        var result = new GroupAnagrams().groupAnagrams(strs);

        // then
        var expected = List.of(List.of(""));
        assertEquals(expected.size(), result.size());
        expected.forEach(e ->
                assertTrue(result.stream().anyMatch(e::containsAll))
        );
    }

    @Test
    void testCaseThree() {
        // given
        String[] strs = {"a"};

        // when
        var result = new GroupAnagrams().groupAnagrams(strs);

        // then
        var expected = List.of(List.of("a"));
        assertEquals(expected.size(), result.size());
        expected.forEach(e ->
                assertTrue(result.stream().anyMatch(e::containsAll))
        );
    }
}