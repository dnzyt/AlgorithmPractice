package com.imooc.problems;

import com.imooc.resource.RandomListNode;

/**
 * Created by dnzyt on 12/20/2015.
 *
 * A->B->C->NULL
 *
 * ��ԭʼ������ÿһ�������渴�������㣬���һ���µ�����A->A1->B->B1->C->C1-NULL
 *
 * Ȼ����random
 * �����������Ͽ�Ϊ�����µ�����
 *
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        if (head.next == null) {
            RandomListNode h = new RandomListNode(head.label);
            if (head.random != null) {
                h.random = h;
            }
            return h;
        }
        RandomListNode current = head;
        while (current != null) {
            RandomListNode temp = new RandomListNode(current.label);
            temp.next = current.next;
            current.next = temp;
            current = current.next.next;
        }

        current = head;
        while (current != null) {
            RandomListNode duplicated = current.next;
            duplicated.random = current.random.next;
            current = duplicated.next;
        }


        RandomListNode newHead = head.next;

        current = head;
        while (current != null) {
            RandomListNode duplicated = current.next;
            current.next = duplicated.next;
            current = duplicated.next;
            duplicated.next = duplicated.next.next;
        }



        return newHead;
    }
}
