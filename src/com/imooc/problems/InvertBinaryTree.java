package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 10/30/2015.
 */
public class InvertBinaryTree {

    public void invertBinaryTree(TreeNode root) {

        if (root == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);




        return;
    }





}
