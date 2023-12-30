package other.missingItems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MissingItemsTest {

    @Test
    void missingProductsReturnsUniqueAndSortedMissingProducts() {
        // given
        int[] requested = {11, 2, 4, 11, 11, 2, 3};
        int[] delivered = {2, 4, 2, 11};

        var expected = List.of(3, 11);

        // when
        var result = MissingItems.missingProducts(requested, delivered);

        // then
        assertEquals(expected, result);
    }

    @Test
    void missingProductsReturnsEmptyListWhenNoProductsMissing() {
        // given
        int[] requested = {1, 3, 5};
        int[] delivered = {5, 3, 1};

        // when
        var result = MissingItems.missingProducts(requested, delivered);

        // then
        assertTrue(result.isEmpty());
    }
}
