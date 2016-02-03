package com.imooc.problems;

/**
 * Created by dnzyt on 2/2/2016.
 *
 * ¶¯Ì¬¹æ»®
 *
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String A, String B) {
        if (A == null || B == null || A.length() == 0 || B.length() == 0)
            return 0;

        int[][] matrix = new int[A.length()][B.length()];

        char tempA = A.charAt(0);
        for (int i = 0; i < B.length(); i++) {
            if (tempA == B.charAt(i)) {
                while (i < B.length()) {
                    matrix[0][i] = 1;
                    i++;
                }
            }
        }

        char tempB = B.charAt(0);
        for (int j = 0; j < A.length(); j++) {
            if (tempB == A.charAt(j)) {
                while (j < A.length()) {
                    matrix[j][0] = 1;
                    j++;
                }
            }
        }

        for (int i = 1; i < A.length(); i++) {
            for (int j = 1; j < B.length(); j++) {
                matrix[i][j] = Math.max(matrix[i - 1][j - 1] + (A.charAt(i) == B.charAt(j) ? 1 : 0), Math.max(matrix[i - 1][j], matrix[i][j - 1]));

            }
        }


        return matrix[A.length() - 1][B.length() - 1];
    }
}




