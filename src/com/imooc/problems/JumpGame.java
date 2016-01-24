package com.imooc.problems;

/**
 * Created by dnzyt on 1/24/2016.
 */
public class JumpGame {
    public boolean canJump(int[] A) {
        boolean[] matrix = new boolean[A.length];
        matrix[0] = true;
        for (int i = 0; i < A.length; i++) {
            if (matrix[i]) {
                for (int j = 1; j <= A[i]; j++) {
                    if (i + j > A.length - 1)
                        break;
                    matrix[i + j] = true;
                }
            } else
                break;
        }

        return matrix[matrix.length - 1];
    }

    //Ì°ÐÄËã·¨
    public boolean greedy(int[] A) {
        int farthest = A[0];

        for (int i = 1; i < A.length; i++) {
            if (i < farthest && A[i] + i >= farthest)
                farthest = A[i] + i;
        }

        return farthest >= A.length - 1;
    }
}
