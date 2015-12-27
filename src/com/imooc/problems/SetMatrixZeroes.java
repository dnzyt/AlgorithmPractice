package com.imooc.problems;

/**
 * Created by dnzyt on 12/27/2015.
 *
 * ��ɨ���һ�к͵�һ�У����Ƿ���Ҫ���㣬����flagRaw��flagCol
 * Ȼ���õ�һ�к͵�һ����Ϊ���
 *
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        if (row == 0)
            return;
        int col = matrix[0].length;
        boolean flagRaw = false;
        boolean flagCol = false;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                flagCol = true;
                break;
            }
        }

        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0) {
                flagRaw = true;
                break;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < col; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (flagRaw) {

            for (int j = 0; j < col; j++)
                matrix[0][j] = 0;
        }
        if (flagCol) {
            for (int i = 0; i < row; i++)
                matrix[i][0] = 0;
        }


    }

}
