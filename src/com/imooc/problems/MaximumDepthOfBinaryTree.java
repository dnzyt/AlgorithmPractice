package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 11/1/2015.
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;


        int length = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        return length;
    }
}
