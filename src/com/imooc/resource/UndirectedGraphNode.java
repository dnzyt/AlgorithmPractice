package com.imooc.resource;

import java.util.ArrayList;

/**
 * Created by dnzyt on 11/21/2015.
 */
public class UndirectedGraphNode {
    public int label;
    public ArrayList<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }
}
