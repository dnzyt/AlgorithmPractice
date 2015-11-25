package com.imooc.problems;

import com.imooc.resource.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ningzeda on 11/25/2015.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        String s = null;
        getPath(root, s, res);


        return res;
    }

    private void getPath(TreeNode root, String str, List<String> res) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            if (str == null) {
                str = "" + root.val;
            } else {
                str = str + "->" +root.val;
            }
            res.add(str);
            return;
        }


        if (str == null) {
            str = "" + root.val;
        } else {
            str = str + "->" +root.val;
        }
        getPath(root.left, str, res);
        getPath(root.right, str, res);
    }
}
