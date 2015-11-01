package com.imooc.problems;

import sun.org.mozilla.javascript.internal.ast.WhileLoop;

/**
 * Created by dnzyt on 10/31/2015.
 */
public class MatrixZigzagTraversal {
    public int[] printZMatrix(int[][] matrix) {
        int[] res = new int[matrix.length * matrix[0].length];

        //处理单行或者单列的特殊情况
        if (matrix.length == 1) {
            return matrix[0];
        }
        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                res[i] = matrix[i][0];
            }
            return res;
        }



        int row = 0;
        int col = 0;
        int index = 0;

        boolean isUp = true;

        //查找拐点，遇到拐点时加入当前元素和下一个元素，置位isUp
        do {
            res[index] = matrix[row][col];
            if (row == 0) {
                if (col + 1 == matrix[0].length) {
                    row++;
                    res[++index] = matrix[row][col];
                    col--;
                    row++;
                    isUp = false;
                } else {
                    col++;
                    res[++index] = matrix[row][col];
                    col--;
                    row++;
                    isUp = false;
                }
            } else if (col == 0) {
                if (row + 1 == matrix.length) {
                    col++;
                    res[++index] = matrix[row][col];
                    row--;
                    col++;
                    isUp = true;
                } else {
                    row++;
                    res[++index] = matrix[row][col];
                    row--;
                    col++;
                    isUp = true;
                }
            } else if (row == matrix.length - 1) {
                col++;
                res[++index] = matrix[row][col];
                row--;
                col++;
                isUp = true;
            } else if (col == matrix[0].length - 1) {
                row++;
                res[++index] = matrix[row][col];
                row++;
                col--;
                isUp = false;
            } else {
                if (isUp) {
                    row--;
                    col++;
                } else {
                    row++;
                    col--;
                }

            }
            index++;
        } while (row != matrix.length && col != matrix[0].length);


        return res;
    }


}
