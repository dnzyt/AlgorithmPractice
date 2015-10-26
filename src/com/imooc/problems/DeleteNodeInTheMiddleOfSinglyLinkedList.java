package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by ningzed on 10/26/15.
 *
 * 从Node开始，把后面的val一个一个往前挪，把最后一个Node置null
 */
public class DeleteNodeInTheMiddleOfSinglyLinkedList {

    public void deleteNode(ListNode node) {
        if (node == null)
            return;

        ListNode current = node.next;

        while (current != null) {
            node.val = current.val;
            if (current.next != null) {
                node = current;
                current = current.next;
            } else {
                node.next = null;
                break;
            }

        }




    }


}
