package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 10/24/2015.
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode current = head;
        if (current == null)
            return null;

        //去除前面的val元素
        while (current.val == val && current.next != null) {
            current = current.next;
        }
        //需要检查最后一个val，有可能也是含有val的元素
        if (current.val == val)
            return null;

        //从现在起current之前的元素都不可能含有val了
        head = current;
        ListNode pre = current;
        current = current.next;

        while (current != null) {
            if (current.val != val) {
                pre.next = current;
                pre = current;
            }
            current = current.next;
        }

        pre.next = null;

        return head;
    }

}
