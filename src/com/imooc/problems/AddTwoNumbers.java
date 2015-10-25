package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 10/24/2015.
 * ”ÎAddBinary∫‹œÒ
 */
public class AddTwoNumbers {

    public ListNode addLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        int carry = (l1.val + l2.val) / 10;

        ListNode head = new ListNode((l1.val + l2.val) % 10);
        ListNode current = head;

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            int digit = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode temp = new ListNode(digit);
            current.next = temp;
            current = temp;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int digit = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            ListNode temp = new ListNode(digit);
            current.next = temp;
            current = temp;
            l1 = l1.next;
        }

        while (l2 != null) {
            int digit = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            ListNode temp = new ListNode(digit);
            current.next = temp;
            current = temp;
            l2 = l2.next;
        }
        if (carry == 1)
            current.next = new ListNode(carry);

        return head;
    }
}
