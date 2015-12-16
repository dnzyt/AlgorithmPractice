package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 12/16/15.
 */
public class IdenticalBinaryTree {
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if ((a == null && b != null) || (a != null && b == null))
            return false;
        if (a.val != b.val)
            return false;



        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}
