package other.alternatingSort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingSortTest {

    @ParameterizedTest
    @MethodSource("printArrayWithAlternatingSortingTestData")
    void shouldPrintArrayWithAlternatingSorting(int[] arr, String expected) {
        // when
        var result = extractString(arr);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> printArrayWithAlternatingSortingTestData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 2, 3, 4, 5, 6}, "7 1 6 2 5 3 4"),
                Arguments.of(new int[]{1, 6, 9, 4, 3, 7, 8, 2}, "9 1 8 2 7 3 6 4")
        );
    }

    private static String extractString(int[] arr) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        new AlternatingSort().printArrayWithAlternatingSort(arr);

        System.setOut(System.out);

        return output.toString().trim();
    }
}
