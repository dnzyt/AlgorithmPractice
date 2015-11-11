package com.imooc.problems;

/**
 * Created by dnzyt1986 on 11/10/2015.
 *
 * ����Ĳ����Ǵӿ�ͷ���������ͬʱ�������������elem��Ԫ�أ���ô�ͰѸ�Ԫ�������ӣ��Ѻ����Ԫ����ǰ��
 * ��ѭ������������ĺ󲿶��Ǻ�elem��ȵ�Ԫ�أ�ǰ�����Ǻ�elem���ȵ�Ԫ�أ��ָ�����currentIndex
 *
 */
public class RemoveElement {

    public int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0)
            return 0;

        int currentIndex = A.length - 1;

        for (int i = 0; i < currentIndex; i++) {
            if (A[i] == elem) {
                int temp = A[i];
                A[i] = A[currentIndex];
                A[currentIndex] = temp;
                i--;
                currentIndex--;
            }
        }

        if (A[currentIndex] != elem)
            return currentIndex + 1;
        else
            return currentIndex;
    }
}
