package other.subarrayWithZeroSum;

import java.util.HashSet;

public class SubarrayWithZeroSum {

    public boolean containsSubarrayWithZeroSum(int[] arr) {
        var sums = new HashSet<Integer>();
        var sum = 0;

        for (var num : arr) {
            sum += num;

            if (sum == 0 || num == 0 || sums.contains(sum)) {
                return true;
            }

            sums.add(sum);
        }

        return false;
    }
}
