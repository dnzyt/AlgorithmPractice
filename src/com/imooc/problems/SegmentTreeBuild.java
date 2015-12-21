package com.imooc.problems;

import com.imooc.resource.SegmentTreeNode;

/**
 * Created by dnzyt on 12/20/2015.
 */
public class SegmentTreeBuild {
    public SegmentTreeNode build(int start, int end) {

        if (start > end)
            return null;

        if (start == end)
            return new SegmentTreeNode(start, end);

        SegmentTreeNode root = new SegmentTreeNode(start, end);
        root.left = build(start, (start + end) / 2);
        root.right = build((start + end) / 2 + 1, end);


        return root;
    }

}
