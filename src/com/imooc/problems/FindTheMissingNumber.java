package com.imooc.problems;

/**
 * Created by ningzed on 1/4/16.
 */
public class FindTheMissingNumber {
    public int findMissing(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res += i;
            res -= nums[i];
        }
        return res;
    }




}
