package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 10/25/2015.
 */
public class ConvertSortedArrayToBinarySearchTreeWithMinimalHeight {

    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null || A.length == 0)
            return null;

        int mid = A.length / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = divide(A, 0, mid - 1);
        root.right = divide(A, mid + 1, A.length - 1);

        return root;
    }

    private TreeNode divide(int[] A, int start, int end) {

        if (start > end)
            return null;
        if (start == end)
            return new TreeNode(A[start]);


        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = divide(A, start, mid - 1);
        root.right = divide(A, mid + 1, end);



        return root;
    }




}
