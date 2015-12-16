package com.imooc.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dnzyt on 12/16/15.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> container = new HashSet<>();

        return helper(n, container);
    }

    private boolean helper(int n, Set<Integer> container) {
        if (n == 1)
            return true;
        if (container.contains(n))
            return false;
        else
            container.add(n);

        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (digit * digit);
            temp /= 10;
        }

        if (sum == 1)
            return true;
        else {
            return helper(sum, container);
        }

    }
}
