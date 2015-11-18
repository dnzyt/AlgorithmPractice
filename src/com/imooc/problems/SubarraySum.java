package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 11/17/2015.
 */
public class SubarraySum {
    public ArrayList<Integer> subarraySum(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            res.add(i);
            if (nums[i] == 0) {
                res.add(i);
                return res;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    res.add(j);
                    return res;
                }
            }
            res.remove(0);
        }
        return null;
    }

}
