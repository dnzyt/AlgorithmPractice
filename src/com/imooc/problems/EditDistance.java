package com.imooc.problems;

/**
 * Created by dnzyt on 1/1/2016.
 *
 * ¶¯Ì¬¹æ»®
 * dp[i][j] = min(dp[i-1][j] + 1, dp[i][j-1] + 1, dp[i-1][j-1] + (word1.charAt(j - 1) == word2.charAt(i - 1) ? 0 : 1))
 *
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] matrix = new int[word2.length() + 1][word1.length() + 1];
        for (int j = 1; j < word1.length() + 1; j++)
            matrix[0][j] = j;
        for (int i = 1; i < word2.length() + 1; i++)
            matrix[i][0] = i;

        for (int i = 1; i < word2.length() + 1; i++) {
            for (int j = 1; j < word1.length() + 1; j++) {
                matrix[i][j] = Math.min(matrix[i][j - 1] + 1, Math.min(matrix[i - 1][j] + 1, matrix[i - 1][j - 1] + (word1.charAt(j - 1) == word2.charAt(i - 1) ? 0 : 1)));
            }
        }


        return matrix[word2.length()][word1.length()];
    }




}
