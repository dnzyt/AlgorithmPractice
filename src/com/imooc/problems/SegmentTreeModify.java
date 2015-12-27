package com.imooc.problems;

import com.imooc.resource.SegmentTreeNode;

/**
 * Created by dnzyt on 12/27/2015.
 */
public class SegmentTreeModify {

    public void modify(SegmentTreeNode root, int index, int value) {
        if (root == null || index < root.start || index > root.end)
            return;


        helper(root, index, value);

    }

    private int helper(SegmentTreeNode root, int index, int value) {

        if (root.start == root.end && root.start != index)
            return root.max;

        if (root.start == index && root.end == index) {
            root.max = value;
            return value;
        }





        root.max = Math.max(helper(root.left, index, value), helper(root.right, index, value));
        return root.max;


    }


}
