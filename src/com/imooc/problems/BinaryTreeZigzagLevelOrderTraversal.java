package com.imooc.problems;

import com.imooc.resource.TreeNode;
import com.sun.javafx.tk.quantum.QuantumToolkit;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ningzed on 12/11/15.
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        LinkedList<TreeNode> qOne = new LinkedList<>();
        LinkedList<TreeNode> qTwo = new LinkedList<>();
        boolean leftToRight = true;

        qOne.add(root);

        do {
            ArrayList<Integer> temp = new ArrayList<>();
            if (leftToRight) {
                qTwo.clear();
                for (int i = 0; i < qOne.size(); i++) {
                    if (qOne.get(i) == null) continue;
                    temp.add(qOne.get(i).val);
                    if (qOne.get(i).left != null)
                        qTwo.add(qOne.get(i).left);
                    if (qOne.get(i).right != null)
                        qTwo.add(qOne.get(i).right);
                }
                res.add(temp);
                leftToRight = false;
            } else {
                qOne.clear();
                for (int i = qTwo.size() - 1; i >= 0; i--) {
                    if (qTwo.get(i) == null) continue;
                    temp.add(qTwo.get(i).val);
                    if (qTwo.get(i).right != null)
                        qOne.push(qTwo.get(i).right);
                    if (qTwo.get(i).left != null)
                        qOne.push(qTwo.get(i).left);

                }
                res.add(temp);
                leftToRight = true;
            }
        } while (qTwo.size() != 0 && qOne.size() != 0);

        return res;
    }
}
