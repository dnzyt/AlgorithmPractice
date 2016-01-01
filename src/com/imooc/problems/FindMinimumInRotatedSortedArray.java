package com.imooc.problems;

/**
 * Created by dnzyt on 1/1/2016.
 * 数组中最后一个数是pivot，最小值之前的数都比pivot大，最小值之后的数都比pivot小
 * 通过不断比较，最后趋近的就是最小值
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] num) {
        int pivot = num[num.length - 1];
        int start = 0;
        int end = num.length - 1;

        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (num[mid] < pivot)
                end = mid;
            else if (num[mid] >= pivot)
                start = mid + 1;
        }
        if (num[start] < pivot)
            return num[start];
        else
            return num[end];
    }
}
