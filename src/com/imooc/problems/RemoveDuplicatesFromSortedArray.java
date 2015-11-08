package com.imooc.problems;

/**
 * Created by dnzyt1986 on 11/8/2015.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        int head = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[head] == nums[i])
                continue;

            nums[++head] = nums[i];
        }
        return head + 1;
    }
}
