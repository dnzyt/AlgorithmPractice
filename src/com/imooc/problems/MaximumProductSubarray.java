package com.imooc.problems;

/**
 * Created by ningzed on 2/22/16.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];


        int[] subArray = new int[nums.length];
        subArray[0] = nums[0];
        int max = subArray[0];
        for (int i = 1; i < nums.length; i++) {
            subArray[i] = subArray[i - 1] * nums[i];
            max = Math.max(subArray[i], max);
        }


        for (int i = 1; i < nums.length; i++) {
            int divider = nums[i - 1];
            if (divider != 0) {
                for (int j = i; j < nums.length; j++) {
                    subArray[j] = subArray[j] / divider;
                    max = Math.max(max, subArray[j]);
                }
            } else {
                subArray[i] = nums[i];
                max = Math.max(max, subArray[i]);
                for (int j = i + 1; j < nums.length; j++) {
                    subArray[j] = nums[j] * subArray[j - 1];
                    max = Math.max(max, subArray[j]);
                }
            }
        }

        return max;
    }
}
