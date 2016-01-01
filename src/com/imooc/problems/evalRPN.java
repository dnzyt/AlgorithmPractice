package com.imooc.problems;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dnzyt on 1/1/2016.
 */
public class evalRPN {
    public int evalRPN (String[] tokens) {

        if (tokens.length == 1)
            return Integer.parseInt(tokens[0]);

        LinkedList<Integer> stack = new LinkedList<>();
        ArrayList<String> operators = new ArrayList<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");

        int res = 0;

        for (String current: tokens) {
            if (operators.contains(current)) {
                int a = stack.pop();
                int b = stack.pop();
                switch (current) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                    default:
                        System.out.println("Error: no operator");
                }
            } else {
                stack.push(Integer.parseInt(current));
            }
        }
        return stack.pop();
    }
}
