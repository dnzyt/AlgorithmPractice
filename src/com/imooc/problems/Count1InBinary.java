package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 *
 * ����Ҫ���׸������������������
 * �Ը��������������ȶԾ���ֵȡ������Ȼ������뱻������ͬ
 *
 * �κ�����2��������ֻ��3�н����1�� 0�� -1
 * ������Ϊ1����-1����ô�����Ʊ��ʽ�е����һλһ����1����ȻΪ 0
 * Ȼ������λ������ͼ���������Ʊ��ʽ���ж��ٸ�1
 *
 */
public class Count1InBinary {

    public int countOnes(int num) {

        int a = 0x7FFFFFFF;

        int count = 0;
        while (num != 0) {
            if (num % 2 == 1 || num % 2 == -1)
                count++;
            num = ((num >> 1) & a);
        }


        return count;
    }
}
