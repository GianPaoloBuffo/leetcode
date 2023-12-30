package other.minimumSwaps;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsTest {

    @ParameterizedTest
    @MethodSource("minimumSwapsTestData")
    void shouldReturnMinimumSwapsNeededToSortArray(int[] arr, int expectedSwaps) {
        assertEquals(expectedSwaps, new MinimumSwaps().minimumSwaps(arr));
    }

    private static Stream<Arguments> minimumSwapsTestData() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 1, 2}, 3),
                Arguments.of(new int[]{2, 3, 4, 1, 5}, 3),
                Arguments.of(new int[]{1, 3, 5, 2, 4, 6, 7}, 3)
        );
    }
}
