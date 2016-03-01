package com.imooc.problems;

/**
 * Created by ningzeda on 3/1/2016.
 */
public class MinimumSizeSubarraySum {
    public int minimumSize(int[] nums, int s) {

        if (nums == null || nums.length == 0)
            return -1;
        int res = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right != nums.length) {
            sum += nums[right];
            if (sum < s) {
                right++;
                continue;
            }
            while (left <= right) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
                if (sum < s)
                    break;
            }
            right++;
        }


        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
