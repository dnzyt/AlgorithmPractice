package com.imooc.problems;

/**
 * Created by dnzyt on 2/8/2016.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        if (s == null || s.length() == 0)
            return 0;

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            int index = temp.indexOf(s.charAt(i));
            if (-1 == index) {
                temp = temp + s.charAt(i);
            } else {
                result = Math.max(temp.length(), result);
                temp = temp.substring(index + 1) + s.charAt(i);
            }


        }
        result = Math.max(temp.length(), result);
        return result;
    }
}
