package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 *
 */
public class CompareStrings {
    public boolean compareStrings(String A, String B) {
        if (B == null)
            return true;

        //ASCII 'A' = 65
        
        //用数组存储A字符串中每个字母出现的次数
        int[] tableA = new int[26];

        for (int i = 0; i < A.length(); i++) {
            //通过英文字母的ASCII减去65来获得数组中的下标
            tableA[A.charAt(i) - 65]++;
        }

        //字符串B中的字母没出现一次， 就找到数组中相应的位置然后减1
        //如果数组中相应位置的值==0，就说明字符串A中不再包含B中的这个字幕，返回false
        for (int i = 0; i < B.length(); i++) {
            if (tableA[B.charAt(i) - 65] > 0) {
                tableA[B.charAt(i) - 65]--;
            } else {
                return false;
            }
        }



        return true;
    }




}
