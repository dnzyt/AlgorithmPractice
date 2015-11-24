package com.imooc.problems;

import java.util.Arrays;

/**
 * Created by ningzeda on 11/24/2015.
 * 0/1 �������� ����̬�滮
 *
 * ������������ı������⣬�ص��ǣ�ÿ����Ʒ����һ��������ѡ��Ż򲻷ţ����������������������⶯̬�滮���ĵ�����ô�����أ�

 1. State: dp[i][S] ��ʾǰi����Ʒ��ȡ��һЩ�ܷ���ɺ�ΪS����ı���

 2. Function: f[i][S] = f[i-1][S - A[i]] or f[i-1][S] (A[i]��ʾ��i����Ʒ�Ĵ�С)

 ת�Ʒ�����õ�f[i][S]ǰi����Ʒȡ��һЩ��Ʒ�����S����ı����� ��ô���Դ�����״̬ת���õ���

 ��1��f[i-1][S - A[i]] �����i����Ʒ������ǰi-1����Ʒ�ܷ�ȡ��һЩ��ɺ�ΪS-A[i] �����С�ı�����

 ��2��f[i-1][S] �������i����Ʒ�� ����ǰi-1����Ʒ�ܷ�ȡ��һЩ��ɺ�ΪS �����С�ı�����

 3. Intialize: f[1...n][0] = true; f[0][1... m] = false

 ��ʼ�� f[1...n][0] ��ʾǰ1...n����Ʒ��ȡ��һЩ�ܷ���ɺ�Ϊ0 ��С�ı���ʼ��Ϊ�档

 ������ʼ��Ϊ��

 4. Answer: Ѱ��ʹf[n][S] ֵΪtrue������S. ��S��ȡֵ��Χ1��m��

 ���������ռ�����һЩҪ��������֪����˼·�𰸹������ǻ���Ҫ�����Ż��ռ临�Ӷ�.�ȿ������潲�Ļ���˼·���ʵ�֣�
 �϶�����һ����ѭ��i=1..N��ÿ���������ά����f[i][0..S]������ֵ����ô�����ֻ��һ������f[0..S]��
 �ܲ��ܱ�֤��i��ѭ��������f[S]�б�ʾ�ľ������Ƕ����״̬f[i][S]�أ�f[i][S]���� f[i-1][S - a[i]] �� f[i-1][S] ������������ƶ�����
 �ܷ�֤����f[i][S]ʱ��Ҳ���ڵ�i����ѭ������f[S]ʱ���ܹ��õ� f[i-1][S - a[i]] �� f[i-1][S] ��ֵ�أ���ʵ�ϣ���Ҫ����ÿ����ѭ����������S=m...0��˳����f[S]��
 �������ܱ�֤��f[S]ʱf[S-a[i]]�������״̬f[i-1][S-a[i]]��ֵ��
 *
 *
 */
public class BackPack {
    public int backPack(int m, int[] A) {
        int N = A.length + 1;
        int M = m + 1;
        boolean[][] res = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            res[i][0] = true;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if (A[i - 1] > j)
                    res[i][j] = res[i - 1][j];
                else
                    res[i][j] = res[i - 1][j - A[i - 1]] || res[i - 1][j];
            }
        }

        for (int i = m; i >= 0; i--) {
            if (res[N - 1][i])
                return i;
        }


        return 0;
    }


    /*
    �����㷨ʱ�临�Ӷ�̫�ߣ������Exceed Time Limit�쳣

    public int backPack(int m, int[] A) {
        Arrays.sort(A);

        return getBackPack(m, A, 0);
    }

    private int getBackPack(int m, int[] A, int index) {
        if (index == A.length || A[index] > m)
            return 0;

        int max = 0;
        for (int i = index; i < A.length; i++) {
            if (A[i] > m)
                continue;
            int temp = A[i] + getBackPack(m - A[i], A, i + 1);
            if (max < temp && temp <= m)
                max = temp;
        }
        return max;
    }
    */

}
