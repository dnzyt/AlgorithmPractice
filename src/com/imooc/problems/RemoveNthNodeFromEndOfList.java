package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt1986 on 11/10/2015.
 *
 * �����˼·����������ָ�룬��ʼ��ʱ��ָ��ͷ���
 * Ȼ��ѵڶ���ָ�������ƶ�N��
 * Ȼ���ٰ�����ָ��ͬʱ����ƶ���ÿ���ƶ�һλ��Ȼ����ڶ���ָ���Ƿ�ָ����β(null)
 * ���ָ������β����ô��һ��ָ����ָ���˴Ӻ�����N����㣬���������Ƴ�����
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < n; i++) {
            second = second.next;
        }
        //����һ���������������������������Ԫ�ظ�������nʱ����ȥ��ͷ��㼴��
        if (second == null)
            return head.next;


        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        ListNode temp = first.next;
        first.next = first.next.next;
        temp.next = null;

        return head;
    }





}
