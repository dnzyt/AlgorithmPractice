package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 11/17/2015.
 */
public class Subtree {
    public boolean isSubtree(TreeNode T1, TreeNode T2) {

        if (T2 == null)
            return true;
        else if (T1 == null)
            return false;
        else
            return isSameTree(T1, T2) || isSubtree(T1.left, T2) || isSubtree(T1.right, T2);

    }

    private boolean isSameTree(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null)
            return true;
        if ((T1 == null || T2 == null) || (T1.val != T2.val))
            return false;

        return isSameTree(T1.left, T2.left) && isSameTree(T1.right, T2.right);
    }
}
