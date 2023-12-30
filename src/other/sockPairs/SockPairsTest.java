package other.sockPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockPairsTest {

    @Test
    void shouldReturn0WhenNoPairs() {
        // given
        int[] socks = {2, 1, 3};

        // when
        int result = SockPairs.countSockPairs(socks);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnCorrectSockPairCount() {
        // given
        int[] socks = {4, 7, 3, 7, 4, 1, 8, 7};
        int expected = 2;

        // when
        int result = SockPairs.countSockPairs(socks);

        // then
        assertEquals(expected, result);
    }
}
