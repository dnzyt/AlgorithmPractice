package com.imooc.problems;

/**
 * Created by ningzeda on 11/20/2015.
 */
public class UniqueCharacters {
    public boolean isUnique(String str) {
        if (str.length() < 2)
            return true;
        boolean[] temp = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            if (!temp[str.charAt(i)])
                temp[str.charAt(i)] = true;
            else
                return false;
        }


        return true;
    }
}
