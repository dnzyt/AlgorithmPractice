package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ningzed on 12/10/15.
 */
public class BinaryTreeSerialization {
    public String serialize(TreeNode root) {
        if (root == null)
            return null;
        // write your code here
        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {
            TreeNode current = queue.poll();
            if (current != null) {
                if (sb.length() == 0)
                    sb.append(current.val);
                else
                    sb.append("," + current.val);
                queue.add(current.left);
                queue.add(current.right);
            } else {
                sb.append(",#");
            }
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null)
            return null;
        // write your code here
        String[] values = data.split(",");
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        for (int i = 1; i < values.length; i += 2) {
            TreeNode current = queue.poll();
            if (current == null) {
                i -= 2;
                continue;
            }
            String l = values[i];
            String r = values[i + 1];
            TreeNode left = l.equals("#") ? null : new TreeNode(Integer.parseInt(l));
            TreeNode right = r.equals("#") ? null : new TreeNode(Integer.parseInt(r));
            current.left = left;
            current.right = right;
            queue.add(left);
            queue.add(right);
        }
        return root;
    }

}
