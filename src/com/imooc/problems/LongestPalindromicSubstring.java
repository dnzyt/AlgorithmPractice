package com.imooc.problems;

/**
 * Created by dnzyt on 2/7/2016.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";
        int maxLength = 0;
        String result = "";

        int length = s.length();

        for (int i = 1; i <= length * 2 - 1; i++) {
            int count = 1;
            while (i - count >= 0 && i + count <= length * 2 && get(s, (i + count)) == get(s, (i - count)))
                count++;
            count--;
            if (maxLength < count) {
                result = s.substring((i - count) / 2, (i + count) / 2);
                maxLength = count;
            }
        }



        return result;
    }


    private char get(String s, int i) {
        if (i % 2 == 0)
            return '#';
        else
            return s.charAt(i / 2);
    }
}
