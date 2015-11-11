package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt1986 on 11/10/2015.
 */
public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = head;
        ListNode current = head.next;

        while (current != null) {

            //先处理头结点，把和头结点相同的结点都去掉
            if (head.val == current.val) {
                ListNode temp = head;
                head = head.next;
                temp.next = null;
                current = current.next;
                pre = head;
                continue;
            } else {
                //如果在链表中出现重复元素，从重复结点处断开，去除重复节点，然后把断开后的前后两个链表再重新连接，这样重复节点被移除
                if (pre.val == current.val) {
                    ListNode temp = current;
                    pre.next = current.next;
                    current = current.next;
                    temp.next = null;
                } else {
                    //如果该处结点不是重复节点，那么继续向后进行
                    pre = pre.next;
                    current = current.next;
                }
            }

        }



        return head;
    }
}
