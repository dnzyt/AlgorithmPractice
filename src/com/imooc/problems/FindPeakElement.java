package com.imooc.problems;

/**
 * Created by dnzyt on 1/2/2016.
 *
 * 每次先拿到mid，比较mid两边，如果满足条件，返回mid
 * 如果mid左边大于mid，那么在mid左边一定有一个值满足条件，那么让end = mid - 1继续迭代
 * 如果mid左边小于mid，那么可能有满足条件的peak，也可能没有，这种情况不考虑，因为题目说返回一个即可
 * 同理对于右边
 *
 */
public class FindPeakElement {
    public int findPeak(int[] A) {
        int start = 0;
        int end = A.length - 1;

        while (start != end) {
            int mid = (start + end) / 2;
            if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1])
                return mid;
            if (mid != 0 && A[mid - 1] > A[mid]) {
                end = mid - 1;
                continue;
            }
            if (mid != A.length + 1 && A[mid + 1] > A[mid]) {
                start = mid + 1;
                continue;
            }
        }
        return start;
    }
}
