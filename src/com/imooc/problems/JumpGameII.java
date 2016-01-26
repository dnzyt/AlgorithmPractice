package com.imooc.problems;

/**
 * Created by dnzyt on 1/25/2016.
 *
 * 贪心算法
 * 每次都尽可能的jump更远
 */
public class JumpGameII {
    public int jump(int[] A) {

        if (A == null || A.length == 0)
            return 0;
        int count = 1;
        int farthest = A[0];

        for (int i = 0; i < A.length; ) {
            if (farthest >= A.length - 1)
                return count;

            int tempFarthest = 0;
            for (int j = i + 1; j <= Math.min(farthest, A.length - 1); j++) {
                if (tempFarthest < A[j] + j)
                    tempFarthest = A[j] + j;
            }
            i = farthest;
            farthest = Math.max(tempFarthest, farthest);

            count++;

        }
        return count;
    }

}
