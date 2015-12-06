package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dnzyt1986 on 12/5/2015.
 *
 * ������Binary Tree Level Order Traversal ����һ����ֻ����res�������level��ʱ��ÿ�ζ�����indexΪ0λ��
 */
public class BinaryTreeLevelOrderTraversalII {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(root);

        ArrayList<Integer> level = null;
        while (queue.size() != 1) {
            TreeNode current = queue.poll();
            if (current == null) {
                queue.add(current);
                if (level == null) {
                    level = new ArrayList<>();
                } else {
                    res.add(0, level);
                    level = new ArrayList<>();
                }
            } else {
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
                level.add(current.val);
            }
        }
        if (level.size() != 0)
            res.add(0, level);
        return res;
    }
}
