package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt on 11/5/2015.
 *
 * ����������ʱ����first������ű�XС�Ľڵ㣬second������ű�X��Ľڵ�
 * ��������Ĺ����У�ÿ����һ���ڵ��ȡ���������ݴ�С����first����second�У�����second����first��β��
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
