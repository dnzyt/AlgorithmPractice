package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 12/14/2015.
 * 后续遍历的最后一个元素是每次迭代的root，然后根据root值在中序数组中找到分割点，分割点左边为左子树，右边为右子树
 * 同理进行迭代
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder.length == 0)
            return null;

        return  buildSubTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);

    }

    private int findIndex(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (target == values[i])
                return i;
        }
        return -1;
    }

    private TreeNode buildSubTree(int[] inorder, int startIn, int endIn, int[] postorder, int startPost, int endPost) {


        if (startIn == endIn)
            return new TreeNode(inorder[startIn]);
        if (startIn > endIn)
            return null;
        TreeNode root = new TreeNode(postorder[endPost]);
        int rootIndex = findIndex(inorder, root.val);
        root.left = buildSubTree(inorder, startIn, rootIndex - 1, postorder, startPost, startPost + rootIndex - 1 - startIn);
        root.right = buildSubTree(inorder, rootIndex + 1, endIn, postorder, endPost - 1 - (endIn - rootIndex - 1), endPost - 1);

        return root;
    }
}
