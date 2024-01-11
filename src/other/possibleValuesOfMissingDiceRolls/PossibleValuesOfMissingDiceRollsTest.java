package other.possibleValuesOfMissingDiceRolls;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PossibleValuesOfMissingDiceRollsTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int[] rolls, int forgottenRolls, int mean, int[] expected) {
        // when
        var result = new PossibleValuesOfMissingDiceRolls()
                .possibleValuesOfMissingDiceRolls(rolls, forgottenRolls, mean);

        // then
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 4, 3}, 2, 4, new int[]{6, 6}),
                Arguments.of(new int[]{1, 5, 6}, 4, 3, new int[]{6, 1, 1, 1}),
                Arguments.of(new int[]{1, 2, 3, 4}, 4, 6, new int[]{0}),
                Arguments.of(new int[]{6, 1}, 1, 1, new int[]{0})
        );
    }
}