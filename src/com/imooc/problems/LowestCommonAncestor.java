package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 2/13/2016.
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {

        if (root == A || root == B)
            return root;

        boolean aInLeft = inTree(root.left, A);
        boolean bInLeft = inTree(root.left, B);

        if (aInLeft && bInLeft)
            return lowestCommonAncestor(root.left, A, B);
        else if (!aInLeft && !bInLeft)
            return lowestCommonAncestor(root.right, A, B);
        return root;
    }


    private boolean inTree(TreeNode root, TreeNode n) {
        if (root == null)
            return false;
        if (root == n)
            return true;
        if (inTree(root.left , n) || inTree(root.right, n))
            return true;
        return false;
    }

}
