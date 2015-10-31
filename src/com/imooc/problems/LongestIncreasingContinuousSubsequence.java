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


    /*
    * �����㷨
    *
    * ��ÿһ�������з���ʱ������ǰ����������������Ȼ����λ
    * ����ýڵ㱻��λ��˵���Ѿ����ʹ���ֱ������
    * public int longestConsecutive(int[] num) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i: num){
            hs.put(i, 0);
        }
        int maxl = 1;
        for(int i: num){
            if (hs.get(i) == 1) continue;

            int tmp = i;
            int current_max = 1;
            while(hs.containsKey(tmp+1)){
                current_max ++;
                tmp ++;
                hs.put(tmp, 1);
            }

            tmp = i;
            while(hs.containsKey(tmp-1)){
                current_max ++;
                tmp --;
                hs.put(tmp, 1);
            }

            maxl = Math.max(current_max, maxl);
        }

        return maxl;
    }
    *
    * */

}
