package com.imooc.problems;

import com.imooc.resource.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ningzeda on 2/26/2016.
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(List<ListNode> lists) {
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1 == null)
                    return -1;
                if (o2 == null)
                    return 1;
                return o1.val - o2.val;
            }
        };

        if (lists == null || lists.size() == 0)
            return null;

        PriorityQueue<ListNode> heap = new PriorityQueue<>(lists.size(), comparator);
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null) {
                heap.add(lists.get(i));
            }
        }
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        while (!heap.isEmpty()) {
            ListNode head = heap.poll();
            tail.next = head;
            tail = head;
            if (tail.next != null) {
                heap.add(tail.next);
            }
        }

        return temp.next;
    }
}
