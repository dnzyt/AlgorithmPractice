package com.imooc.resource;

/**
 * Created by dnzyt on 12/20/2015.
 */
public class RandomListNode {
    public int lable;
    public RandomListNode next;
    public RandomListNode random;
    public RandomListNode(int x) {
        this.lable = x;
        random = null;
        next = null;
    }
}
