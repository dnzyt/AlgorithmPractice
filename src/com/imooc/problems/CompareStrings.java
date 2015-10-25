package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 *
 */
public class CompareStrings {
    public boolean compareStrings(String A, String B) {
        if (B == null)
            return true;

        //ASCII 'A' = 65
        
        //������洢A�ַ�����ÿ����ĸ���ֵĴ���
        int[] tableA = new int[26];

        for (int i = 0; i < A.length(); i++) {
            //ͨ��Ӣ����ĸ��ASCII��ȥ65����������е��±�
            tableA[A.charAt(i) - 65]++;
        }

        //�ַ���B�е���ĸû����һ�Σ� ���ҵ���������Ӧ��λ��Ȼ���1
        //�����������Ӧλ�õ�ֵ==0����˵���ַ���A�в��ٰ���B�е������Ļ������false
        for (int i = 0; i < B.length(); i++) {
            if (tableA[B.charAt(i) - 65] > 0) {
                tableA[B.charAt(i) - 65]--;
            } else {
                return false;
            }
        }



        return true;
    }




}
