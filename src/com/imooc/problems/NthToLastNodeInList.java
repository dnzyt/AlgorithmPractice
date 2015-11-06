package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 11/5/2015.
 */
public class NthToLastNodeInList {

    public ListNode nthToLast(ListNode head, int n) {
        ListNode start = head;
        ListNode end = head;

        for (int i = 0; i < n; i++) {
            end = end.next;
        }

        while (end != null) {
            start = start.next;
            end = end.next;
        }




        return start;
    }







}
