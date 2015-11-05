package com.imooc.problems;

/**
 * Created by dnzyt1986 on 11/4/2015.
 */
public class MergeSortedArray {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        if (n == 0)
            return;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                A[i] = B[i];
            }
            return;
        }

        int pm = m - 1;
        int pn = n - 1;
        int current;
        for (current = m + n - 1; current >= 0; current--) {

            int temp = Math.max(A[pm], B[pn]);
            if (A[pm] > B[pn]) {
                pm--;
            } else {
                pn--;
            }
            A[current] = temp;
            if (pm < 0 || pn < 0)
                break;
        }

        while (pn >= 0) {
            A[--current] = B[pn--];
        }

        return;
    }
}
