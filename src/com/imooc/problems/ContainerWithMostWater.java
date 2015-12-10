package com.imooc.problems;

/**
 * Created by dnzyt on 12/9/2015.
 *
 * �����˼б�,���ǰ��Ⱥ���С����ô��ǰ�����ƶ�start���ҵ���һ�����ߵĵ�
 * ��������ǰ��С����ô�Ӻ���ǰ�ƶ����ҵ���һ�����ߵĵ�
 */
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {

        if (heights == null || heights.length <= 1)
            return 0;
        int max = 0;

        int start = 0;
        int end = heights.length - 1;

        while (start < end) {
            int tempHeight = Math.min(heights[start], heights[end]);
            max = Math.max(max, tempHeight * (end - start));

            if (heights[start] < heights[end]) {
                start++;
                while (start < end && heights[start] < heights[start - 1])
                    start++;
                continue;
            } else {
                end--;
                while (start < end && heights[end] < heights[end + 1])
                    end--;
                continue;
            }
        }

        return max;
    }
}
