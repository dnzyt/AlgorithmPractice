package com.imooc.problems;

/**
 * Created by dnzyt on 2/3/2016.
 *
 * 动态规划，找到Longest Common Suffix， Longest Common Suffix就是Longest Common Substring
 *
 *
 */
public class LongestCommonSubstring {

    public int longestCommonSubstring(String A, String B) {
        if (A == null || B == null || A.length() == 0 || B.length() == 0)
            return 0;

        int[][] matrix = new int[A.length() + 1][B.length() + 1];
        int result = 0;
        for (int i = 1; i <= A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    result = Math.max(result, matrix[i][j]);
                }

            }

        }



        return result;
    }

}
