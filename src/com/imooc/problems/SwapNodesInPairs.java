package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 11/18/2015.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode prev = null;

        head = current.next;
        prev = current;
        current = current.next;
        prev.next = current.next;
        current.next = prev;
        current = prev.next;

        while (current != null && current.next != null) {
            ListNode temp = current;
            current = current.next;
            temp.next = current.next;
            current.next = temp;
            prev.next = current;

            prev = temp;
            current = temp.next;
        }


        return head;
    }


}
