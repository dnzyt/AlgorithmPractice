package com.imooc.problems;

/**
 * Created by dnzyt1986 on 11/9/2015.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        // write your code here
        int count = 0;
        int currentIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                if (nums[currentIndex] == nums[i]) {
                    count++;
                    nums[++currentIndex] = nums[i];
                } else {
                    nums[++currentIndex] = nums[i];
                }
            } else if (count == 1){
                if (nums[currentIndex] == nums[i]) {

                } else {
                    nums[++currentIndex] = nums[i];
                    count = 0;
                }
            }




        }

        return currentIndex + 1;
    }
}
