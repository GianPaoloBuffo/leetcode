package leetcode.twoHundredSeventyEight_firstBadVersion;

class VersionControl {
    boolean isBadVersion(int version) {
        double random = Math.random();
        return random < 0.5;
    }
}

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean isBadVersion = isBadVersion(mid);

            if (isBadVersion && !isBadVersion(mid - 1)) return mid;
            else if (!isBadVersion) l = mid + 1;
            else r = mid;
        }

        throw new IllegalArgumentException();
    }
}
