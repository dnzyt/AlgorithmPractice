package com.imooc.problems;

/**
 * Created by dnzyt on 2/5/2016.
 */
public class LongestIncreasingSubsequence {

    public int longestIncreasingSubsequence(int[] nums) {
        int[] temp = new int[nums.length];

        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            temp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] <= nums[i]) {
                    temp[i] = temp[i] > temp[j] + 1 ? temp[i] : temp[j] + 1;

                }

            }
            maxLength = Math.max(maxLength, temp[i]);

        }


        return maxLength;
    }



}
