package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 11/5/2015.
 *
 * 创建两个临时链表，first用来存放比X小的节点，second用来存放比X大的节点
 * 遍历链表的过程中，每遇到一个节点便取出来，根据大小放在first或者second中，最后把second接在first的尾部
 *
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null)
            return head;


        ListNode current = head;

        ListNode res = null;
        ListNode firstCurrent = null;
        ListNode secondRes = null;
        ListNode secondCurrent = null;



        while(current != null) {
            if (current.val < x) {
                if (res == null) {
                    res = current;
                    firstCurrent = current;
                    current = current.next;
                    firstCurrent.next = null;
                } else {
                    ListNode temp = current;
                    current = current.next;
                    temp.next = null;
                    firstCurrent.next = temp;
                    firstCurrent = temp;
                }
            } else {
                if (secondRes == null) {
                    secondRes = current;
                    secondCurrent = current;
                    current = current.next;
                    secondCurrent.next = null;
                } else {
                    ListNode temp = current;
                    current = current.next;
                    temp.next = null;
                    secondCurrent.next = temp;
                    secondCurrent = temp;
                }
            }
        }

        if (res == null)
            return secondRes;
        firstCurrent.next = secondRes;
        return res;
    }





}
