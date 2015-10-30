package com.imooc.problems;

import com.imooc.resource.ListNode;
import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 10/29/2015.
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;


        //建立一个新的链表，用来存放排序后的数字
        ListNode root = new ListNode(head.val);
        ListNode current = head.next;

        while (current != null) {
            //先判断是否比新链表的头小，如果小的话，用这个数字来替换头结点
            if (current.val <= root.val) {
                ListNode temp = new ListNode(current.val);
                temp.next = root;
                root = temp;
                current = current.next;
                continue;
            }

            //遍历新的链表，找到current的数字应该存放的位置
            ListNode pre = root;
            ListNode inner = root.next;
            while (inner != null) {
                if (current.val <= inner.val) {
                    ListNode temp = new ListNode(current.val);
                    pre.next = temp;
                    temp.next = inner;
                    current = current.next;
                    break;
                } else {
                    pre = inner;
                    inner = inner.next;
                }
            }
            //如果在新链表中没找到current数字的位置，说明current数字比新链表中任何的数字都大，所以存放在最后
            if (inner == null) {
                pre.next = new ListNode(current.val);
                current = current.next;
            }
        }
        return root;
    }

}
