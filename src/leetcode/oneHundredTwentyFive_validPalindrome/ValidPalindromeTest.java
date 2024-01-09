package leetcode.oneHundredTwentyFive_validPalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(String s, boolean expected) {
        // when
        var result = new ValidPalindrome().isPalindrome(s);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("ace a car", false),
                Arguments.of(" ", true)
        );
    }
}
