package com.imooc.problems;

import java.util.HashMap;

/**
 * Created by ningzeda on 11/20/2015.
 */
public class TwoStringsAreAnagrams {
    public boolean anagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i);
            res -= t.charAt(i);
        }

        return res == 0;
    }

}
