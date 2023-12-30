package other.firstUniqueCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    void shouldReturnIndexOfUniqueCharacter() {
        // given
        String s = "leetcode";

        // when
        var result = FirstUniqueCharacter.firstUniqChar(s);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnIndexOfUniqueCharacterInPositionTwo() {
        // given
        String s = "loveleetcode";

        // when
        var result = FirstUniqueCharacter.firstUniqChar(s);

        // then
        assertEquals(2, result);
    }

    @Test
    void shouldReturnMinusOneIfNoUniqueCharacters() {
        // given
        String s = "aabb";

        // when
        var result = FirstUniqueCharacter.firstUniqChar(s);

        // then
        assertEquals(-1, result);
    }
}
