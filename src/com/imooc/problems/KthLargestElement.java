package com.imooc.problems;

/**
 * Created by dnzyt on 1/31/2016.
 */
public class KthLargestElement {
    public int kthLargestElement(int k, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;




        return helper(nums,0, nums.length - 1, k);
    }

    private int helper(int[] nums, int l, int r, int k) {
        if (l == r)
            return nums[l];
        int position = partition(nums, l, r);
        if (position + 1 == k)
            return nums[position];
        else if (position + 1 < k)
            return helper(nums, position + 1, r, k);
        else
            return helper(nums,l, position - 1, k);
    }


    private int partition(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int index = l;
        int pivot = nums[r];
        for (int i = l; i < r; i++) {
            if (nums[i] >= pivot) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        nums[r] = nums[index];
        nums[index] = pivot;

        return index;
    }


}
