package com.imooc.problems;

/**
 * Created by dnzyt on 1/2/2016.
 *
 * ÿ�����õ�mid���Ƚ�mid���ߣ������������������mid
 * ���mid��ߴ���mid����ô��mid���һ����һ��ֵ������������ô��end = mid - 1��������
 * ���mid���С��mid����ô����������������peak��Ҳ����û�У�������������ǣ���Ϊ��Ŀ˵����һ������
 * ͬ������ұ�
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
