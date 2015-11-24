package com.imooc.problems;

import java.util.Arrays;

/**
 * Created by ningzeda on 11/24/2015.
 * 0/1 背包问题 ，动态规划
 *
 * 本题是最基础的背包问题，特点是：每种物品仅有一件，可以选择放或不放，那下面我们来看背包这题动态规划的四点是怎么样的呢？

 1. State: dp[i][S] 表示前i个物品，取出一些能否组成和为S体积的背包

 2. Function: f[i][S] = f[i-1][S - A[i]] or f[i-1][S] (A[i]表示第i个物品的大小)

 转移方程想得到f[i][S]前i个物品取出一些物品想组成S体积的背包。 那么可以从两个状态转换得到。

 （1）f[i-1][S - A[i]] 放入第i个物品，并且前i-1个物品能否取出一些组成和为S-A[i] 体积大小的背包。

 （2）f[i-1][S] 不放入第i个物品， 并且前i-1个物品能否取出一些组成和为S 体积大小的背包。

 3. Intialize: f[1...n][0] = true; f[0][1... m] = false

 初始化 f[1...n][0] 表示前1...n个物品，取出一些能否组成和为0 大小的背包始终为真。

 其他初始化为假

 4. Answer: 寻找使f[n][S] 值为true的最大的S. （S的取值范围1到m）

 由于这道题空间上有一些要求，所以在知道了思路答案过后我们还需要进行优化空间复杂度.先考虑上面讲的基本思路如何实现，
 肯定是有一个主循环i=1..N，每次算出来二维数组f[i][0..S]的所有值。那么，如果只用一个数组f[0..S]，
 能不能保证第i次循环结束后f[S]中表示的就是我们定义的状态f[i][S]呢？f[i][S]是由 f[i-1][S - a[i]] 和 f[i-1][S] 两个子问题递推而来，
 能否保证在推f[i][S]时（也即在第i次主循环中推f[S]时）能够得到 f[i-1][S - a[i]] 和 f[i-1][S] 的值呢？事实上，这要求在每次主循环中我们以S=m...0的顺序推f[S]，
 这样才能保证推f[S]时f[S-a[i]]保存的是状态f[i-1][S-a[i]]的值。
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
    这种算法时间复杂度太高，会产生Exceed Time Limit异常

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
