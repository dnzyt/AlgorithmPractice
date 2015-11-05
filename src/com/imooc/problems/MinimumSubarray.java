package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by ningzed on 11/5/15.
 *
 * 关键在于能找出到每个节点的subarray最小值
 *
 */
public class MinimumSubarray {

    public int minSubArray(ArrayList<Integer> nums) {
        if (nums == null)
            return 0;

        int length = nums.size();
        int[] localMin = new int[length];
        int[] globalMin = new int[length];

        localMin[0] = nums.get(0);
        globalMin[0] = nums.get(0);

        for (int i = 1 ; i < length; i++) {
            localMin[i] = Math.min(localMin[i - 1] + nums.get(i), nums.get(i));
            globalMin[i] = Math.min(globalMin[i - 1], localMin[i]);
        }



        return globalMin[length - 1];
    }


}
