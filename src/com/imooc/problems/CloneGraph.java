package com.imooc.problems;

import com.imooc.resource.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by dnzyt on 12/11/2015.
 *
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 *
 * ��HashMap����¾ɽ��Ķ�Ӧ��key��ɽ�㣬value���½�㣬��BFS����ͼ
 *
 */
public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;

        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        LinkedList<UndirectedGraphNode> queue = new LinkedList<>();

        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        queue.add(node);
        map.put(node, head);

        while (queue.size() != 0) {
            UndirectedGraphNode current = queue.poll();
            for (UndirectedGraphNode neighbor: current.neighbors) {
                if (!map.containsKey(neighbor)) {
                    queue.add(neighbor);
                    UndirectedGraphNode n = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor, n);
                }
                map.get(current).neighbors.add(map.get(neighbor));
            }

        }

        return head;
    }
}
