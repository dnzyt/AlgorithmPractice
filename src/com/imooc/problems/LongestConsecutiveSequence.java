package com.imooc.problems;

import java.util.HashSet;

/**
 * Created by dnzyt on 2/5/2016.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        int result = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int n: num) {
            hs.add(n);
        }

        for (Integer n: num) {
            int temp = 1;
            int current = n;
            while (hs.contains(++current)) {
                ++temp;
                hs.remove(current);
            }
            current = n;
            while (hs.contains(--current)) {
                ++temp;
                hs.remove(current);
            }

            result = Math.max(temp, result);
        }


        return result;
    }
}
