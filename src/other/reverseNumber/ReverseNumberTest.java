package other.reverseNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseNumberTest {

    @ParameterizedTest
    @MethodSource("testData")
    void shouldPassTestCases(int num, int expected) {
        // when
        var result = extractString(num);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1234, 4321),
                Arguments.of(2, 2),
                Arguments.of(10000, 1),
                Arguments.of(10101, 10101)
        );
    }

    private static int extractString(int num) {
        var output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));
        new ReverseNumber().reverseNumber(num);
        System.setOut(System.out);

        return Integer.parseInt(output.toString().trim());
    }
}