package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 11/12/2015.
 */
public class ReverseWordsInAString {

    public String reverseWords(String s) {

        StringBuilder temp = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (temp.length() == 0) {
                    continue;
                } else {
                    arr.add(temp.toString());
                    temp = new StringBuilder();
                }
            } else {
                temp.append(s.charAt(i));
            }
        }

        if (temp.length() != 0)
            arr.add(temp.toString());

        StringBuilder res = new StringBuilder();
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (i == arr.size() - 1)
                res.append(arr.get(i));
            else {
                res.append(" ").append(arr.get(i));
            }
        }



        return res.toString();
    }

}
