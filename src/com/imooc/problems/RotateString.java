package com.imooc.problems;

/**
 * Created by dnzyt on 11/15/2015.
 */
public class RotateString {
    public void rotateString(char[] str, int offset) {
        if (offset == 0 || str == null || str.length == 0)
            return;
        if (offset >= str.length) {
            offset = offset % str.length;
        }


        char[] temp = new char[offset];
        for (int i = 0; i < offset; i++) {
            temp[i] = str[str.length - offset + i];
        }

        for (int i = str.length - 1 - offset; i >= 0; i--) {
            str[i + offset] = str[i];
        }
        for (int i = 0; i < offset; i++) {
            str[i] = temp[i];
        }
        return;
    }
}
