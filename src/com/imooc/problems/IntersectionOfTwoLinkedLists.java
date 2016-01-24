package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 1/24/2016.
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == headB)
            return headA;
        if (headA == null || headB == null)
            return null;

        int countA = 0;
        int countB = 0;

        ListNode current = headA;
        while (current != null) {
            countA++;
            current = current.next;
        }

        current = headB;
        while (current != null) {
            countB++;
            current = current.next;
        }

        if (countA > countB) {
            int diff = countA - countB;
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
            return getInter(headA, headB);
        } else if (countA < countB) {
            int diff = countB - countA;
            for (int i = 0; i < diff; i++) {
                headB = headB.next;
            }
            return getInter(headA, headB);
        }

        return getInter(headA, headB);
    }

    private ListNode getInter(ListNode headA, ListNode headB) {
        while (headA != null) {
            if (headA == headB)
                return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;
    }

}
