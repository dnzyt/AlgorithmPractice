package com.imooc.problems;

/**
 * Created by dnzyt on 11/1/2015.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res < 0) {
                if (nums[i] >= 0) {
                    res = nums[i];
                    temp = nums[i];
                    continue;
                } else {
                    if (res < nums[i]) {
                        res = nums[i];
                    }
                }
            } else {
                temp += nums[i];
                if (temp < 0) {
                    temp = 0;
                } else {
                    if (res < temp) {
                        res = temp;
                    }
                }
            }
        }
        return res;
    }


    public int maxSubArrayDP(int[] nums) {
        int sum = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0)   //看之前的sum对这次累加有没有贡献
                sum = 0;
            sum += nums[i];
            res = Math.max(sum, res);
        }

        return res;

    }


}
