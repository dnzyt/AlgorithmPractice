package com.imooc.problems;

import java.util.ArrayList;

/**
 * Created by dnzyt1986 on 11/8/2015.
 *
 * �ҵ��ϵ㴦��Ȼ��reverse�ϵ�֮ǰ�����У� Ȼ����reverse�ϵ�֮������У����reverse��������
 *
 */
public class RecoverRotatedSortedArray {
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                reverse(nums, 0, i);
                reverse(nums, i + 1, nums.size() - 1);
                reverse(nums, 0, nums.size() - 1);

            }
        }
    }

    private void reverse(ArrayList<Integer> nums, int start, int end) {

        while (start < end) {
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }

}
