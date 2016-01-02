package com.imooc.problems;

/**
 * Created by dnzyt on 1/2/2016.
 */
public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] num) {
        if (num == null || num.length == 0)
            return -1;

        int pivot = num[num.length - 1];
        int start = 0;
        int end = num.length - 1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != pivot) {
                start = i;
                break;
            }
        }

        for (int i = num.length - 1; i > 0; i--) {
            //处理最小值等于pivot时这种情况
            if (num[i - 1] > pivot) {
                end = i;
                break;
            }
            if (num[i - 1] != pivot) {
                end = i - 1;
                break;
            }
        }

        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (num[mid] > pivot) {
                start = mid + 1;
            } else if (num[mid] <= pivot) {
                end = mid;
            }
        }

        if (num[start] < pivot)
            return num[start];
        else
            return num[end];


    }
}
