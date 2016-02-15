package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 2/15/2016.
 */
public class MajorityNumberII {

    public int majorityNumber(ArrayList<Integer> nums) {

        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (candidate1 == nums.get(i))
                count1++;
            else if (candidate2 == nums.get(i))
                count2++;
            else if (count1 == 0) {
                candidate1 = nums.get(i);
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = nums.get(i);
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == candidate1)
                count1++;
            else if (nums.get(i) == candidate2)
                count2++;
        }


        return count1 > count2 ? candidate1 : candidate2;
    }

}
