package com.imooc.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by dnzyt on 2/15/2016.
 */
public class MajorityNumberIII {
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        HashMap<Integer, Integer> counters = new HashMap<>();
        for (Integer number: nums) {
            if (!counters.containsKey(number)) {
                counters.put(number, 1);
            } else
                counters.put(number, counters.get(number) + 1);

            if (counters.size() >= k)
                removeKey(counters);
        }

        if (counters.size() == 0)
            return Integer.MIN_VALUE;
        for (Integer number: counters.keySet())
            counters.put(number, 0);
        for (Integer num: nums) {
            if (counters.containsKey(num))
                counters.put(num, counters.get(num) + 1);
        }

        int maxCounter = 0;
        int maxKey = 0;
        for (Integer key: counters.keySet()) {
            if (counters.get(key) > maxCounter) {
                maxCounter = counters.get(key);
                maxKey = key;
            }
        }



        return maxKey;
    }




    private void removeKey(HashMap<Integer, Integer> counters) {
        Set<Integer> keySet = counters.keySet();
        ArrayList<Integer> keysToRemove = new ArrayList<>();

        for (Integer num: keySet) {
            counters.put(num, counters.get(num) - 1);
            if (counters.get(num) == 0)
                keysToRemove.add(num);
        }

        for (Integer key: keysToRemove)
            counters.remove(key);

    }
}
