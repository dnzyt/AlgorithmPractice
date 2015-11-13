package com.imooc.problems;

import com.imooc.resource.ListNode;

/**
 * Created by dnzyt1986 on 11/10/2015.
 *
 * 该题的思路是声明两个指针，开始的时候都指向头结点
 * 然后把第二个指针往后移动N次
 * 然后再把两个指针同时向后移动，每次移动一位，然后检查第二个指针是否指向链尾(null)
 * 如果指向了链尾，那么第一个指针则指向了从后数第N个结点，把这个结点移除即可
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < n; i++) {
            second = second.next;
        }
        //处理一种特殊情况，就是链表中所含的元素个数等于n时，则去掉头结点即可
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
