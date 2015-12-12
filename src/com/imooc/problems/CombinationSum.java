package com.imooc.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dnzyt on 12/12/2015.
 * 用Stack来存放中间过程中的值，通过target与0比较决定出栈还是入栈
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], i, res, temp);
            temp.remove(temp.size() - 1);
        }
        System.out.println(res);
        return res;
    }

    private void helper(int[] candidates, int target, int index, List<List<Integer>> res, ArrayList<Integer> temp) {
        if (target == 0) {
            List<Integer> t = new ArrayList<>(temp);
            res.add(t);
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0)
                break;
            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], i, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
