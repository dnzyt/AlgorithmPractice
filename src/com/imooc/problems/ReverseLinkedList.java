package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 11/12/2015.
 */
public class ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode res = null;
        ListNode current = head;

        while (current != null) {

            ListNode temp = current.next;
            current.next = res;
            res = current;
            current = temp;

        }

        return res;
    }

}
