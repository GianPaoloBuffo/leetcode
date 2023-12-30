package other.listIntersection;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListIntersectionTest {

    @Test
    void shouldWorkWithEmptyLists() {
        // given
        List<Integer> first = Collections.emptyList();
        List<Integer> second = Collections.emptyList();

        // when
        var result = ListIntersection.intersection(first, second);

        // then
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldWorkWithScenario1() {
        // given
        List<Integer> first = List.of(1, 2, 3);
        List<Integer> second = List.of(9, 3, 4);

        var expected = List.of(3);

        // when
        var result = ListIntersection.intersection(first, second);

        // then
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void shouldWorkWithScenario2() {
        // given
        List<Integer> first = List.of(10, 35, 14);
        List<Integer> second = List.of(90, 35, 10, 14, 28);

        var expected = List.of(10, 35, 14);

        // when
        var result = ListIntersection.intersection(first, second);

        // then
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void shouldWorkWithScenario3() {
        // given
        List<Integer> first = List.of(100, 25, 134, 2, 4);
        List<Integer> second = List.of(4, 2);

        var expected = List.of(4, 2);

        // when
        var result = ListIntersection.intersection(first, second);

        // then
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void shouldWorkWithScenario4() {
        // given
        List<Integer> first = List.of(10, 35, 14);
        List<Integer> second = Collections.emptyList();

        // when
        var result = ListIntersection.intersection(first, second);

        // then
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldWorkWithScenario5() {
        // given
        List<Integer> first = List.of(10, 35, 14);
        List<Integer> second = List.of(1, 2, 3);

        // when
        var result = ListIntersection.intersection(first, second);

        // then
        assertTrue(result.isEmpty());
    }
}
