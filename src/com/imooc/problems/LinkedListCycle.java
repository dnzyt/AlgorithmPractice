package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 1/31/16.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;


        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {
            if (p1 == p2)
                return true;
            p1 = p1.next;
            if (p2.next == null)
                return false;
            p2 = p2.next.next;
        }




        return false;
    }
}
