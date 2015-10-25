package com.imooc.problems;

/**
 * Created by dnzyt on 10/24/2015.
 * 把字符串里的数字按照倒叙放在数组里
 * 然后找到两个数组中的较短的长度
 * 按位相加，注意进位
 * 然后处理数组中多出来的长度
 * 最后倒叙输出数组
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int[] arrA = new int[a.length()];
        int[] arrB = new int[b.length()];

        //把字符串里的数字按照倒叙放在数组里
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(a.length() - 1 - i);
            arrA[i] = Integer.parseInt(t + "");
        }

        for (int i = 0; i < b.length(); i++) {
            char t = b.charAt(b.length() - 1 - i);
            arrB[i] = Integer.parseInt(t + "");
        }

        //然后找到两个数组中的较短的长度
        int len = Math.min(arrA.length, arrB.length);

        //储存进位
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        //按位相加，注意进位
        for (int i = 0; i < len; i++) {
            int digit = (arrA[i] + arrB[i] + carry) % 2;
            carry = (arrA[i] + arrB[i] + carry) / 2;
            sb.append(digit);
        }

        //然后处理数组中多出来的长度
        for (int i = len; i < arrA.length; i++) {
            int digit = (arrA[i] + carry) % 2;
            carry = (arrA[i] + carry) / 2;
            sb.append(digit);
        }

        //然后处理数组中多出来的长度
        for (int i = len; i < arrB.length; i++) {
            int digit = (arrB[i] + carry) % 2;
            carry = (arrB[i] + carry) / 2;
            sb.append(digit);
        }

        if (carry == 1)
            sb.append(carry);

        //最后倒叙输出数组
        return sb.reverse().toString();
    }





}
