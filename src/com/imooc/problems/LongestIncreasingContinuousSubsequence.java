package com.imooc.problems;

/**
 * Created by dnzyt on 10/31/2015.
 */
public class LongestIncreasingContinuousSubsequence {
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        if (A.length == 1)
            return 1;

        boolean flag = A[0] < A[1] ? true : false;  //�������ӻ���ٵķ�ת��־
        int longest = 0;
        int temp = 1;

        for (int i = 1; i < A.length; i++) {
            if (flag) {
                //�ۼ�С��
                if (A[i - 1] < A[i]) {
                    temp++;
                } else {  //��ת
                    flag = !flag;
                    if (longest < temp)
                        longest = temp;
                    temp = 2;
                }
            } else {
                //�ۼӴ���
                if (A[i - 1] > A[i]) {
                    temp++;
                } else { //��ת
                    flag = !flag;
                    if (longest < temp) {
                        longest = temp;
                    }
                    temp = 2;
                }
            }
        }
        if (longest < temp)
            longest = temp;

        return longest;
    }



}
