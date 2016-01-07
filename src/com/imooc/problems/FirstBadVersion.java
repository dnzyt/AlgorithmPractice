package com.imooc.problems;

/**
 * Created by dnzyt on 1/4/16.
 */
public class FirstBadVersion {
    public int findFirstBadVersion(int n) {
        int start = 1;
        int end = n;

        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            boolean tempRes = SVNRepo.isBadVersion(mid);
            if (tempRes) {
                res = mid;
                end = mid - 1;
                if (end == 0 || !SVNRepo.isBadVersion(end))
                    break;
            } else {
                start = mid + 1;
                if (SVNRepo.isBadVersion(start))
                    return start;
            }
        }

        return res;
    }

    static class SVNRepo {
        public static boolean isBadVersion(int k) {
            return true;
        }
    }
}
