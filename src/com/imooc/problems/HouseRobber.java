package com.imooc.problems;

/**
 * Created by dnzyt on 1/12/2016.
 */
public class HouseRobber {
    public long houseRobber(int[] A) {
        long robbed = 0;
        long notRobbed = 0;

        for (int i = 0; i < A.length; i++) {
            long temp = robbed;
            robbed = notRobbed + (long)A[i];
            notRobbed = Math.max(temp, notRobbed);
        }




        return Math.max(robbed, notRobbed);
    }

}
