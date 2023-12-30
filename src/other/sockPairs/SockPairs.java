package other.sockPairs;

import java.util.HashSet;

public class SockPairs {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int countSockPairs(int[] socks) {
        HashSet<Integer> unmatched = new HashSet<>();
        int pairs = 0;

        for (int sock : socks) {
            if (!unmatched.add(sock)) {
                unmatched.remove(sock);
                pairs++;
            }
        }

        return pairs;
    }
}
