package com.imooc.problems;

/**
 * Created by dnzyt on 10/30/2015.
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        if (s == "" || s == null)
            return 0;


        StringBuilder sb = new StringBuilder();
        int i = s.charAt(s.length() - 1) == ' ' ? s.length() - 2 : s.length() - 1;
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                break;
            }

        }



        return sb.toString().length();
    }





}
