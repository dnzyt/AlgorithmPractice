package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 */
public class CosineSimilarity {

    public double cosineSimilarity(int[] A, int[] B) {
        double nA = norm(A);
        double nB = norm(B);
        double m = 0;
        if (nA == 0 || nB == 0)
            return 2.0;

        for (int i = 0; i < A.length; i++) {
            m += A[i] * B[i];
        }

        return m / (nA * nB);
    }

    private double norm(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += (a[i] * a[i]);
        }

        return Math.sqrt(res);
    }
}
