package com.imooc.problems;

/**
 * Created by dnzyt on 11/15/2015.
 *
 * 通过两次二分查找，先找到所在的行，然后再找到列
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        if (matrix[0] == null || matrix[0].length == 0)
            return false;

        int row = matrix.length;
        int col = matrix[0].length;


        //Find the row which contains the target
        int start = 0;
        int end = row - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (matrix[mid][col - 1] < target) {
                start = mid + 1;
            } else if (matrix[mid][col - 1] > target) {
                end = mid;
            } else
                return true;
        }

        row = end;
        start = 0;
        end = matrix[0].length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            } else
                return true;

        }

        return false;
    }

}
