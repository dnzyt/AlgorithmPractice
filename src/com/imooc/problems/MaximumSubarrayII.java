package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by ningzed on 2/22/16.
 */
public class MaximumSubarrayII {
    public int maxTwoSubarrays(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0)
            return 0;
        if (nums.size() == 1)
            return nums.get(0);
        if (nums.size() == 2)
            return nums.get(0) + nums.get(1);

        int[] left = new int[nums.size()];
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            localMax = Math.max(nums.get(i), localMax + nums.get(i));
            globalMax = Math.max(localMax, globalMax);
            left[i] = globalMax;
        }

        localMax = 0;
        globalMax = Integer.MIN_VALUE;

        int res = Integer.MIN_VALUE;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (i < nums.size() - 1) {
                res = Math.max(res, globalMax + left[i]);
            }
            localMax = Math.max(nums.get(i), localMax + nums.get(i));
            globalMax = Math.max(globalMax, localMax);

        }

        return res;
    }
}
