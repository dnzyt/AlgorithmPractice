package com.imooc.problems;

/**
 * Created by ningzeda on 11/15/2015.
 */
public class SpaceReplacement {
    public int replaceBlank(char[] string, int length) {
        if (string == null || string.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ')
                count++;
        }
        if (count == 0)
            return length;

        int newLength = length + count * 2;

        int j = 1;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] != ' ') {
                string[newLength - j] = string[i];
                j++;
            } else {
                string[newLength - j] = '0';
                j++;
                string[newLength - j] = '2';
                j++;
                string[newLength - j] = '%';
                j++;
            }
        }

        return newLength;
    }
}
