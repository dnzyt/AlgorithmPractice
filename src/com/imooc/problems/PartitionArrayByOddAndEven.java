package com.imooc.problems;

/**
 * Created by dnzyt on 11/5/2015.
 *
 * 把偶数向后扔
 *
 *
 */
public class PartitionArrayByOddAndEven {

    public void partitionArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int start = 0;
        int end = nums.length - 1;
        while (start != end) {
            if (nums[start] % 2 == 0) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
            } else {
                start++;
            }

        }
        return;
    }


}
