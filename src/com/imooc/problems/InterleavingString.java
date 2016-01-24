package com.imooc.problems;

/**
 * Created by dnzyt on 1/23/16.
 *
 * 二维动态规划
 *
 * interleave(s1, s2, s3) = (interleave(s1 - 1, s2, s3 - 1) && s3.last == s1.last) || (interleave(s1, s2 - 1, s3 - 1) && s3.last == s2.last)
 *
 * 换句话说就是在二维矩阵中,当前值等于左边和上边的 "||" 值并且比较最后一个字符是否和s1或s2的尾值相等
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;

        boolean[][] matrix = new boolean[s1.length() + 1][s2.length() + 1];
        matrix[0][0] = true;
        for (int i = 1; i < s1.length() + 1; i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1)) {
                matrix[i][0] = true;
            } else
                break;
        }

        for (int j = 1; j < s2.length() + 1; j++) {
            if (s2.charAt(j - 1) == s3.charAt(j - 1)) {
                matrix[0][j] = true;
            } else
                break;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if ((matrix[i - 1][j] && s3.charAt(i + j - 1) == s1.charAt(i - 1)) || (matrix[i][j - 1] && s3.charAt(i + j - 1) == s2.charAt(j - 1))) {
                    matrix[i][j] = true;
                }




            }
        }




        return matrix[matrix.length - 1][matrix[0].length - 1];
    }

}
