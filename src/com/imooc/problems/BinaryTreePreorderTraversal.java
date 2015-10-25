package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;

/**
 * Created by dnzyt on 10/24/2015.
 */
public class BinaryTreePreorderTraversal {

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<>();

        preorder(root, array);

        return array;
    }

    private void preorder(TreeNode root, ArrayList<Integer> array) {

        if (root == null)
            return;

        array.add(root.val);
        preorder(root.left, array);
        preorder(root.right, array);

    }


}
