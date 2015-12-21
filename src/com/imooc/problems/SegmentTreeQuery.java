package com.imooc.problems;

import com.imooc.resource.SegmentTreeNode;

/**
 * Created by dnzyt on 12/20/2015.
 */
public class SegmentTreeQuery {
    public int query(SegmentTreeNode root, int start, int end) {

        if (root.start == start && root.end == end)
            return root.max;

        int mid = (root.start + root.end) / 2;

        if (end <= mid) {
            return query(root.left, start, end);
        } else if (start > mid) {
            return query(root.right, start, end);
        } else {
            return Math.max(query(root.left, start, mid), query(root.right, mid + 1, end));
        }
    }




}
