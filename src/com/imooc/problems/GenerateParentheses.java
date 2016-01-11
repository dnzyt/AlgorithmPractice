package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by ningzed on 1/11/16.
 */
public class GenerateParentheses {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        helper(res, sb, n, n);

        return res;
    }

    private void helper(ArrayList<String> res, StringBuilder sb, int nLeft, int nRight) {
        if (nRight == 0) {
            res.add(sb.toString());
            return;
        }
        if (nLeft > 0) {
            sb.append("(");
            helper(res, sb, nLeft - 1, nRight);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (nRight > nLeft) {
            sb.append(")");
            helper(res, sb, nLeft, nRight - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        return;
    }
}
