package com.imooc.problems;

/**
 * Created by dnzyt on 11/15/2015.
 * ���ֲ��ң�����ҵ�target��ô������λ��
 * ���û���ҵ�target����start��end��ֵ��target���Ƚ� ����ʵֻ��start��target���бȽϼ��ɣ�,���ݱȽϽ��������Ӧλ��
 *
 */
public class SearchInsertionPosition {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0)
            return 0;
        if (A[A.length - 1] < target)
            return A.length;
        if (A[0] > target)
            return 0;

        int start = 0;
        int end = A.length - 1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < A[mid]) {
                end = mid - 1;
            } else if (target > A[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        if (A[start] > target)
            return start;


        return 0;
    }

}
