package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt1986 on 11/4/2015.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode res;
        ListNode current;

        if (p1.val < p2.val) {
            res = p1;
            p1 = p1.next;
        } else {
            res = p2;
            p2 = p2.next;
        }
        current = res;
        current.next = null;


        while (p1 != null && p2 != null) {
            ListNode temp;
            if (p1.val < p2.val) {
                temp = p1;
                p1 = p1.next;
            } else {
                temp = p2;
                p2 = p2.next;
            }
            temp.next = null;
            current.next = temp;
            current = temp;
        }

        if (p1 != null) {
            current.next = p1;
        }

        if (p2 != null) {
            current.next = p2;
        }

        return res;
    }


}
