package other.occurrencesInSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OccurrencesInSortedArrayTest {

    @Test
    void shouldCountOccurrencesCorrectly() {
        // given
        int[] arr = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target = 8;

        // when
        int result = OccurrencesInSortedArray.countOccurrences(arr, target);

        // then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnZeroIfNoOccurrences() {
        // given
        int[] arr = {3, 5, 5, 5, 5, 7, 8, 8};
        int target = 6;

        // when
        int result = OccurrencesInSortedArray.countOccurrences(arr, target);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldCountOccurrencesCorrectlyTwo() {
        // given
        int[] arr = {3, 5, 5, 5, 5, 7, 8, 8};
        int target = 5;

        // when
        int result = OccurrencesInSortedArray.countOccurrences(arr, target);

        // then
        assertEquals(4, result);
    }
}
