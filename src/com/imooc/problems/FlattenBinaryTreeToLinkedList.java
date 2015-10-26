package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by ningzed on 10/26/15.
 */
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {

        dfs(root);


        return;
    }

    private TreeNode dfs(TreeNode root) {

        if (root == null)
            return null;

        TreeNode right = root.right;
        TreeNode left = root.left;

        root.right = null;
        root.left = null;

        TreeNode tail = root;



        if (left != null) {
            tail.right = left;
            tail = dfs(left);
        }

        if (right != null) {
            tail.right = right;
            tail = dfs(right);
        }


        return tail;
    }

}
