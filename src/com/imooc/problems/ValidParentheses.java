package com.imooc.problems;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by dnzyt on 11/21/2015.
 */
public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        if (s == null || s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;

        ArrayList<Character> left = new ArrayList<>();
        left.add('(');
        left.add('{');
        left.add('[');

        ArrayList<Character> right = new ArrayList<>();
        right.add(')');
        right.add('}');
        right.add(']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (left.contains(current)) {
                stack.push(current);
                continue;
            } else {
                char temp = stack.pop();
                if (temp == '(' && current == ')')
                    continue;
                else if (temp == '{' && current == '}')
                    continue;
                else if (temp == '[' && current == ']')
                    continue;
                else
                    return false;
            }
        }


        return stack.isEmpty();
    }
}
