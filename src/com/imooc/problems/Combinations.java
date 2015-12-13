package com.imooc.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dnzyt on 12/12/2015.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            helper(n, k - 1, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }

        return res;
    }

    private void helper(int n, int k, int index, List<List<Integer>> res, List<Integer> temp) {
        if (k == 0) {
            ArrayList<Integer> t = new ArrayList<>(temp);
            res.add(t);
            return;
        }

        for (int i = index; i < n + 1; i++) {
            temp.add(i);
            helper(n, k - 1, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }

    }
}
