package com.imooc.problems;

import com.imooc.resource.ListNode;
import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 12/19/2015.
 */
public class ConvertSortedListToBalancedBST {
    public TreeNode sortedListToBST(ListNode head) {

        if (head == null)
            return null;

        if (head.next == null)
            return new TreeNode(head.val);

        ListNode mid = findMid(head);
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);


        return root;
    }

    private ListNode findMid(ListNode head) {

        ListNode prev = null;
        ListNode oneMove = head;
        ListNode twoMove = head;
        while (twoMove.next != null) {
            prev = oneMove;
            oneMove = oneMove.next;
            twoMove = twoMove.next;
            if (twoMove.next != null)
                twoMove = twoMove.next;
        }
        //��������ߵ�β����Ϊ�գ���mid�����γ������µĶ���
        prev.next = null;

        return oneMove;
    }



}
