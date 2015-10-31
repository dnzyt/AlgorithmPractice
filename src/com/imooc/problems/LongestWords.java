package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt on 10/31/2015.
 */
public class LongestWords {

    ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> res = new ArrayList<>();
        int length = 0;
        for (String temp: dictionary) {
            if (temp.length() == length) {
                res.add(temp);
            } else if (temp.length() > length) {
                length = temp.length();
                res = new ArrayList<>();
                res.add(temp);
            }
        }
        return res;
    }


}
