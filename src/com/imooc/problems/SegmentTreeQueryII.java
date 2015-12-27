package com.imooc.problems;

import com.imooc.resource.SegmentTreeNode;

/**
 * Created by dnzyt on 12/27/2015.
 */
public class SegmentTreeQueryII {
    public int query(SegmentTreeNode root, int start, int end) {
        if (root == null)
            return 0;
        start = root.start < start ? start : root.start;
        end = root.end > end ? end : root.end;

        int res = helper(root, start, end);

        return res;
    }

    private int helper(SegmentTreeNode root, int start, int end) {
        if (start > end)
            return 0;
        if (root.start == start && root.end == end)
            return root.count;

        int mid = (root.start + root.end) / 2;

        if (mid > end)
            return helper(root.left, start, end);
        else if (mid < start)
            return helper(root.right, start, end);


        return helper(root.left, start, mid) + helper(root.right, mid + 1, end);
    }
}
