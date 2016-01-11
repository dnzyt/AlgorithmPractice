package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by ningzed on 1/11/16.
 */
public class GrayCode {

    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n <= 1) {
            for (int i = 0; i <= n; i++)
                res.add(i);
            return res;
        }
        res = grayCode(n - 1);
        ArrayList<Integer> temp = reverse(res);
        int x = 1 << (n - 1);
        for (int i = 0; i < temp.size(); i++) {
            temp.set(i, temp.get(i) + x);
        }
        res.addAll(temp);

        return res;
    }

    private ArrayList<Integer> reverse(ArrayList<Integer> values) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = values.size() - 1; i >= 0; i--)
            res.add(values.get(i));

        return res;
    }

}
