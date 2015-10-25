package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 *
 * 首先要明白负数求余数的运算规则：
 * 对负数求余数，首先对绝对值取余数，然后符号与被除数相同
 *
 * 任何数对2求余数，只有3中结果：1， 0， -1
 * 如果结果为1或者-1，那么二进制表达式中的最后一位一定是1，不然为 0
 * 然后结合移位运算符就计算出二进制表达式中有多少个1
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
