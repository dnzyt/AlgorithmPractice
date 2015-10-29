package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 10/28/2015.
 */
public class InsertNodeInABinarySearchTree {

    public TreeNode insertNode(TreeNode root, TreeNode node) {

        if (root == null)
            return node;
        if (node == null)
            return root;

        insert(root, node);

        return root;
    }

    private void insert(TreeNode root, TreeNode node) {

        TreeNode current = root;
        if (node.val < current.val) {
            if (current.left == null) {
                current.left = node;
                return;
            }
            insertNode(current.left, node);
        } else {
            if (current.right == null) {
                current.right = node;
                return;
            }
            insertNode(current.right, node);
        }


    }
}
