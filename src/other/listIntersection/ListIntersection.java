package other.listIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListIntersection {

    // Time complexity: O(n) - size of second list
    // Space complexity: O(n)
    public static List<Integer> intersection(List<Integer> first, List<Integer> second) {
        var firstCount = new HashMap<Integer, Integer>();
        for (var num : first) {
            firstCount.put(num, firstCount.getOrDefault(num, 0) + 1);
        }

        var intersection = new ArrayList<Integer>();
        for (var num : second) {
            var intersectingNumCount = firstCount.get(num);
            if (intersectingNumCount != null && intersectingNumCount > 0) {
                intersection.add(num);
                firstCount.put(num, firstCount.get(num) - 1);
            }
        }

        return intersection;
    }
}
