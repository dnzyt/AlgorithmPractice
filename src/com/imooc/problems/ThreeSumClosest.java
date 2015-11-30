package com.imooc.problems;

import java.util.Arrays;

/**
 * Created by ningzeda on 11/30/2015.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0)
            return 0;

        int res = 0;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                if (Math.abs(target - cur - numbers[left] - numbers[right]) < Math.abs(diff)) {
                    diff = target - cur - numbers[left] - numbers[right];
                    if (diff == 0)
                        return target;

                    if (target - cur - numbers[left] - numbers[right] < 0) {
                        right--;
                    } else {
                        left++;
                    }

                    while (left < right && numbers[right] == numbers[right - 1])
                        right--;
                    while (left < right && numbers[left] == numbers[left + 1])
                        left++;
                    continue;

                }
                if (target - cur - numbers[left] - numbers[right] > 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return target - diff;
    }
}
