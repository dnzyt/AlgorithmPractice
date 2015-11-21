package com.imooc.problems;

import com.imooc.resource.UndirectedGraphNode;

import java.util.*;

/**
 * Created by dnzyt on 11/21/2015.
 */
public class FindTheConnectedComponentInTheUndirectedGraph {
    public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
        List<List<Integer>> res = new ArrayList<>();
        if (nodes == null || nodes.size() == 0)
            return res;

        ArrayList<UndirectedGraphNode> count = new ArrayList<UndirectedGraphNode>();
        for (UndirectedGraphNode node: nodes) {
            if (count.contains(node))
                continue;
            else {
                List<Integer> temp = new ArrayList<>();
                addNode(temp, node, count);
                res.add(temp);
            }
        }



        return res;
    }

    private void addNode(List<Integer> res, UndirectedGraphNode node, ArrayList<UndirectedGraphNode> count) {
        count.add(node);
        res.add(node.label);

        if (node.neighbors.size() == 0)
            return;
        for (UndirectedGraphNode n: node.neighbors) {
            if (count.contains(n))
                continue;
            addNode(res, n, count);
        }
        Collections.sort(res);
    }
}
