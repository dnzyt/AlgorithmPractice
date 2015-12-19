package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 12/18/2015.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {




        return buildSubtree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private int findIndex(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (target == values[i]) {
                return i;
            }
        }
        return -1;
    }


    private TreeNode buildSubtree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn) {

        if (startPre > endPre)
            return null;

        TreeNode root = new TreeNode(preorder[startPre]);
        int index = findIndex(inorder, preorder[startPre]);
        root.left = buildSubtree(preorder, startPre + 1, startPre + (index - startIn), inorder, startIn, index - 1);
        root.right = buildSubtree(preorder, endPre - (endIn - index) + 1, endPre, inorder, index + 1, endIn);


        return root;
    }

}
