package other.firstRecurringCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstRecurringCharacterTest {

    @Test
    void shouldReturnLetterC() {
        // given
        String s = "abccbaacz";

        // when
        var result = FirstRecurringCharacter.repeatedCharacter(s);

        // then
        assertEquals('c', result);
    }

    @Test
    void shouldReturnLetterD() {
        // given
        String s = "abcdd";

        // when
        var result = FirstRecurringCharacter.repeatedCharacter(s);

        // then
        assertEquals('d', result);
    }
}
