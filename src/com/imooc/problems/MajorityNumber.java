package com.imooc.problems;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by dnzyt on 10/31/2015.
 */
public class MajorityNumber {

    public int majorityNumber(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int size = nums.size() / 2;
        for (Integer i: nums) {

            Integer temp = hashMap.get(i);
            if (temp == null) {
                temp = 0;
            }
            temp++;
            if (temp > size)
                return i;
            hashMap.put(i, temp);

        }
        return 0;
    }
}
