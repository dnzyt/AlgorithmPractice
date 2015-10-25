package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;

/**
 * Created by dnzyt on 10/24/2015.
 */
public class BinaryTreeInorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();

        inorder(root, arr);





        return arr;
    }

    private void inorder(TreeNode root, ArrayList<Integer> array) {
        if (root == null)
            return;

        inorder(root.left, array);
        array.add(root.val);
        inorder(root.right, array);

        return;
    }


}
