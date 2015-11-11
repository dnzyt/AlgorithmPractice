package com.imooc.problems;

/**
 * Created by dnzyt1986 on 11/10/2015.
 *
 * 本题的策略是从开头遍历数组的同时，如果遇到等于elem的元素，那么就把该元素往后扔，把后面的元素往前扔
 * 当循环结束后，数组的后部都是和elem相等的元素，前部都是和elem不等的元素，分割点就是currentIndex
 *
 */
public class RemoveElement {

    public int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0)
            return 0;

        int currentIndex = A.length - 1;

        for (int i = 0; i < currentIndex; i++) {
            if (A[i] == elem) {
                int temp = A[i];
                A[i] = A[currentIndex];
                A[currentIndex] = temp;
                i--;
                currentIndex--;
            }
        }

        if (A[currentIndex] != elem)
            return currentIndex + 1;
        else
            return currentIndex;
    }
}
