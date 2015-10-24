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

        //ȥ��ǰ���valԪ��
        while (current.val == val && current.next != null) {
            current = current.next;
        }
        //��Ҫ������һ��val���п���Ҳ�Ǻ���val��Ԫ��
        if (current.val == val)
            return null;

        //��������current֮ǰ��Ԫ�ض������ܺ���val��
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
