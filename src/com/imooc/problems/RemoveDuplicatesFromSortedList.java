package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt1986 on 11/10/2015.
 */
public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = head;
        ListNode current = head.next;

        while (current != null) {

            //�ȴ���ͷ��㣬�Ѻ�ͷ�����ͬ�Ľ�㶼ȥ��
            if (head.val == current.val) {
                ListNode temp = head;
                head = head.next;
                temp.next = null;
                current = current.next;
                pre = head;
                continue;
            } else {
                //����������г����ظ�Ԫ�أ����ظ���㴦�Ͽ���ȥ���ظ��ڵ㣬Ȼ��ѶϿ����ǰ�������������������ӣ������ظ��ڵ㱻�Ƴ�
                if (pre.val == current.val) {
                    ListNode temp = current;
                    pre.next = current.next;
                    current = current.next;
                    temp.next = null;
                } else {
                    //����ô���㲻���ظ��ڵ㣬��ô����������
                    pre = pre.next;
                    current = current.next;
                }
            }

        }



        return head;
    }
}
