package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by ningzeda on 11/25/2015.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        // write your code here
        if (Math.abs(level(root.left) - level(root.right)) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int level(TreeNode root) {
        if (root == null)
            return 0;
        else
            return Math.max(1 + level(root.left), 1 + level(root.right));
    }

}
