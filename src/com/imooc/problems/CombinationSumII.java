package com.imooc.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ningzed on 12/14/15.
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (num == null)
            return res;

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(num[i]);
            helper(num, target - num[i], i + 1, res, temp);
            temp.remove(temp.size() - 1);

            //去除重复的数字
            while (i + 1 < num.length && num[i + 1] == num[i]) {
                i++;
            }
        }
        return res;
    }

    private void helper(int[] num, int target, int index, List<List<Integer>> res, ArrayList<Integer> temp) {
        if (target == 0) {
            List<Integer> t = new ArrayList<>(temp);
            res.add(t);
            return;
        }

        if (target < 0)
            return;

        for (int i = index; i < num.length; i++) {
            temp.add(num[i]);
            helper(num, target - num[i], i + 1, res, temp);
            temp.remove(temp.size() - 1);

            //去除重复的数字
            while (i + 1 < num.length && num[i + 1] == num[i]) {
                i++;
            }
        }
        return;
    }
}
