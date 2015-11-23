package com.imooc.problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dnzyt on 11/22/2015.
 */
public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (numbers == null || numbers.length < 3)
            return res;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++) {
            if (i != 0 && numbers[i] == numbers[i - 1])
                continue;
            int left = i + 1;
            int right = numbers.length - 1;

            while (left < right) {
                int sum = numbers[i] + numbers[left] + numbers[right];
                if (sum == 0) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(numbers[i]);
                    temp.add(numbers[left]);
                    temp.add(numbers[right]);
                    res.add(temp);
                    left++;
                    right--;
                    while (left < right && numbers[left] == numbers[left - 1])
                        left++;
                    while (left < right && numbers[right] == numbers[right + 1])
                        right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;

            }


        }

        return res;
    }


}
