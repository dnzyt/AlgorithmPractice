package com.imooc.resource;

/**
 * Created by dnzyt on 12/20/2015.
 */
public class RandomListNode {
    public int label;
    public RandomListNode next;
    public RandomListNode random;
    public RandomListNode(int x) {
        this.label = x;
        random = null;
        next = null;
    }
}
