package com.imooc.problems;

import com.imooc.resource.ListNode;
import com.imooc.resource.TreeNode;

/**
 * Created by dnzyt on 10/29/2015.
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;


        //����һ���µ����������������������
        ListNode root = new ListNode(head.val);
        ListNode current = head.next;

        while (current != null) {
            //���ж��Ƿ���������ͷС�����С�Ļ���������������滻ͷ���
            if (current.val <= root.val) {
                ListNode temp = new ListNode(current.val);
                temp.next = root;
                root = temp;
                current = current.next;
                continue;
            }

            //�����µ������ҵ�current������Ӧ�ô�ŵ�λ��
            ListNode pre = root;
            ListNode inner = root.next;
            while (inner != null) {
                if (current.val <= inner.val) {
                    ListNode temp = new ListNode(current.val);
                    pre.next = temp;
                    temp.next = inner;
                    current = current.next;
                    break;
                } else {
                    pre = inner;
                    inner = inner.next;
                }
            }
            //�������������û�ҵ�current���ֵ�λ�ã�˵��current���ֱ����������κε����ֶ������Դ�������
            if (inner == null) {
                pre.next = new ListNode(current.val);
                current = current.next;
            }
        }
        return root;
    }

}
