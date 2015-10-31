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

        boolean flag = A[0] < A[1] ? true : false;  //控制增加或减少的反转标志
        int longest = 0;
        int temp = 1;

        for (int i = 1; i < A.length; i++) {
            if (flag) {
                //累加小于
                if (A[i - 1] < A[i]) {
                    temp++;
                } else {  //反转
                    flag = !flag;
                    if (longest < temp)
                        longest = temp;
                    temp = 2;
                }
            } else {
                //累加大于
                if (A[i - 1] > A[i]) {
                    temp++;
                } else { //反转
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
    * 九章算法
    *
    * 对每一个结点进行访问时，看其前后结点的升降序情况，然后置位
    * 如果该节点被置位，说明已经访问过，直接跳过
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
