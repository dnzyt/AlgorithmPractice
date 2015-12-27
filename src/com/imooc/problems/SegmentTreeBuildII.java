package com.imooc.problems;

import com.imooc.resource.SegmentTreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by dnzyt on 12/27/2015.
 */
public class SegmentTreeBuildII {
    public SegmentTreeNode build(int[] A) {

        if (A == null)
            return null;


        return buildSub(A, 0, A.length - 1);
    }


    private int findMaxValue(int[] A, int start, int end) {
        int max = A[start];
        for (int i = start + 1; i <= end; i++) {
            max = max > A[i] ? max : A[i];
        }
        return max;
    }

    private SegmentTreeNode buildSub(int[] A, int start, int end) {

        if (start > end)
            return null;

        if (start == end)
            return new SegmentTreeNode(start, end, A[start]);

        SegmentTreeNode root = new SegmentTreeNode(start, end, findMaxValue(A, start, end));
        int mid = (start + end) / 2;
        root.left = buildSub(A, start, mid);
        root.right = buildSub(A, mid + 1, end);

        return root;
    }



}
