package com.imooc.problems;

import java.util.Stack;

/**
 * Created by dnzyt on 1/23/16.
 * stack1zuo作为输入,stack2作为输出,每次输出时检测stack2是否为空,如果为空,就把stack1中的元素倾到stack2中
 */
public class ImplementQueueByTwoStacks {

    private class Queue {
        private Stack<Integer> stack1;  // In-Stack
        private Stack<Integer> stack2;  // Out-Stack

        public Queue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int element) {
            stack1.push(element);
        }

        public int pop() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) { return  Integer.MIN_VALUE; }
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int top() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) { return  Integer.MIN_VALUE; }
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }


    }




}
