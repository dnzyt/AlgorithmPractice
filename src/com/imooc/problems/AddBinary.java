package com.imooc.problems;

/**
 * Created by dnzyt on 10/24/2015.
 * ���ַ���������ְ��յ������������
 * Ȼ���ҵ����������еĽ϶̵ĳ���
 * ��λ��ӣ�ע���λ
 * Ȼ���������ж�����ĳ���
 * ������������
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int[] arrA = new int[a.length()];
        int[] arrB = new int[b.length()];

        //���ַ���������ְ��յ������������
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(a.length() - 1 - i);
            arrA[i] = Integer.parseInt(t + "");
        }

        for (int i = 0; i < b.length(); i++) {
            char t = b.charAt(b.length() - 1 - i);
            arrB[i] = Integer.parseInt(t + "");
        }

        //Ȼ���ҵ����������еĽ϶̵ĳ���
        int len = Math.min(arrA.length, arrB.length);

        //�����λ
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        //��λ��ӣ�ע���λ
        for (int i = 0; i < len; i++) {
            int digit = (arrA[i] + arrB[i] + carry) % 2;
            carry = (arrA[i] + arrB[i] + carry) / 2;
            sb.append(digit);
        }

        //Ȼ���������ж�����ĳ���
        for (int i = len; i < arrA.length; i++) {
            int digit = (arrA[i] + carry) % 2;
            carry = (arrA[i] + carry) / 2;
            sb.append(digit);
        }

        //Ȼ���������ж�����ĳ���
        for (int i = len; i < arrB.length; i++) {
            int digit = (arrB[i] + carry) % 2;
            carry = (arrB[i] + carry) / 2;
            sb.append(digit);
        }

        if (carry == 1)
            sb.append(carry);

        //������������
        return sb.reverse().toString();
    }





}
