package com.imooc.problems;

/**
 * Created by dnzyt on 1/12/2016.
 */
public class Heapify {
    public void heapify(int[] A) {
        for (int i = A.length / 2; i >= 0; i--) {
            shitDown(A, i);
        }

    }

    private void shitDown(int[] A, int k) {
        int smallest = k;
        while (smallest < A.length) {
            if (2 * k + 1 < A.length && A[2 * k + 1] < A[smallest]) {
                smallest = 2 * k + 1;
            }
            if (2 * k + 2 < A.length && A[2 * k + 2] < A[smallest]) {
                smallest = 2 * k + 2;
            }
            if (smallest == k)
                break;

            int temp = A[smallest];
            A[smallest] = A[k];
            A[k] = temp;
            k = smallest;
        }

    }


}
