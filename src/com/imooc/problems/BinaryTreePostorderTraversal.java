package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;

/**
 * Created by dnzyt on 10/24/2015.
 */
public class BinaryTreePostorderTraversal {

    public ArrayList<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> array = new ArrayList<>();

        postorder(root, array);
        return array;
    }

    private void postorder(TreeNode root, ArrayList<Integer> array) {

        if (root == null)
            return;

        postorder(root.left, array);
        postorder(root.right, array);
        array.add(root.val);

        return ;
    }









}
