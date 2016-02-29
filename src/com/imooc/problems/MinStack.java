package com.imooc.problems;

import java.util.Stack;

/**
 * Created by ningzeda on 2/29/2016.
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int number) {
        stack.push(number);
        if (minStack.isEmpty())
            minStack.push(number);
        else
            minStack.push(Math.min(number, minStack.peek()));
    }

    public int pop() {
        minStack.pop();

        return stack.pop();
    }

    public int min() {

        return minStack.peek();
    }
}
