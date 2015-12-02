package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Created by ningzeda on 12/1/2015.
 * 用Null作为每一层的分割点
 */
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(root);

        LinkedList<TreeNode> level = null;
        while (queue.size() != 1) {
            TreeNode current = queue.poll();
            if (current == null) {
                if (level != null) {
                    ArrayList<Integer> a = new ArrayList<>();

                    for (TreeNode n: level) {
                        a.add(n.val);
                    }
                    res.add(a);

                }
                level = new LinkedList<>();
                queue.add(null);
            } else {
                level.add(current);
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
        if (level.size() != 0) {
            ArrayList<Integer> a = new ArrayList<>();

            for (TreeNode n: level) {
                a.add(n.val);
            }
            res.add(a);
        }
        return res;
    }
}
