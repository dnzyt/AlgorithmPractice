package com.imooc.problems;

import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt1986 on 12/5/2015.
 */
public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;
        subPathSum(root, res);

        return res[0];
    }


    //��ÿһ���ڵ㶼�����������һ����ֻ�����Լ����ڶ�����ֻ�����Լ������ӻ����Һ��ӣ��������ǼȰ����Լ����ְ������Ӻ��Һ���
    private int subPathSum(TreeNode root, int[] res) {
        if (root == null)
            return 0;

        int left = subPathSum(root.left, res);
        int right = subPathSum(root.right, res);

        int includeSelf = left + right + root.val;
        int singleSide = root.val + Math.max(left, right);
        int bigger = Math.max(root.val, Math.max(includeSelf, singleSide));
        res[0] = res[0] > bigger ? res[0] : bigger;

        return singleSide;
    }
}
