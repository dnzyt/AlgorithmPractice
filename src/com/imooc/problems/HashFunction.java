package com.imooc.problems;

/**
 * Created by dnzyt on 10/27/2015.
 */
public class HashFunction {

    public int hashCode(char[] key, int HASH_SIZE) {

        int res = 0;
        int base = 1;
        for (int i = key.length - 1; i >=0 ; i--) {
            res += modMultiply(key[i], base, HASH_SIZE);
            res %= HASH_SIZE;
            base = modMultiply(base, 33, HASH_SIZE);
        }

        return res;
    }


    private int modMultiply(long value, long base, int hash_size) {
        long temp = value * base % hash_size;


        return (int)temp;
    }



}
