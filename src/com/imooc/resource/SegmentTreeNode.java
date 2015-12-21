package com.imooc.resource;

/**
 * Created by dnzyt on 12/20/2015.
 */
public class SegmentTreeNode {

    public int start;
    public int end;
    public SegmentTreeNode left;
    public SegmentTreeNode right;
    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.left = null;
        this.right = null;
    }



}
