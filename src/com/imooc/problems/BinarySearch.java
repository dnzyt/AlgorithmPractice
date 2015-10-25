package com.imooc.problems;

/**
 * Created by dnzyt on 10/24/2015.
 */
public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        if (nums == null)
            return -1;

        //防止处理重复元素时数组访问越界
        if (nums[0] == target)
            return 0;

        int len = nums.length;
        int mid = len / 2;

        int pivot = nums[mid];

        if (target < pivot)
            return biSearch(nums, target, 0, mid - 1);
        else if (target > pivot)
            return biSearch(nums, target, mid + 1, len - 1);
        else {
            while (nums[mid - 1] == target) {
                --mid;
            }
            return mid;
        }
    }

    private int biSearch(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = (start + end) / 2;
        int pivot = nums[mid];

        if (target < pivot)
            return biSearch(nums, target, 0, mid - 1);
        else if (target > pivot)
            return biSearch(nums, target, mid + 1, end);
        else {
            while (nums[mid - 1] == target) {
                --mid;
            }
            return mid;
        }

    }







}
