package com.imooc.problems;

/**
 * Created by ningzeda on 3/14/2016.
 */
public class MinimumWindowSubstring {
    public String minWindow(String source, String target) {
        int[] srcCount = new int[256];
        int[] foundCount = new int[256];

        int start = 0;
        int winStart = -1;
        int winEnd = source.length();
        int foundLen = 0;
        for (int i = 0; i < target.length(); i++)
            srcCount[target.charAt(i)]++;

        for (int i = 0; i < source.length(); i++) {
            if (srcCount[source.charAt(i)] != 0) {
                foundCount[source.charAt(i)]++;
                if (foundCount[source.charAt(i)] <= srcCount[source.charAt(i)])
                    foundLen++;
                if (foundLen == target.length()) {
                    while (srcCount[source.charAt(start)] == 0 || foundCount[source.charAt(start)] > srcCount[source.charAt(start)]) {
                        if (srcCount[source.charAt(start)] != 0)
                            foundCount[source.charAt(start)]--;
                        start++;
                    }
                    if (winEnd - winStart > i - start) {
                        winEnd = i;
                        winStart = start;
                    }
                    foundCount[source.charAt(start)]--;
                    start++;
                    foundLen--;
                }
            }

        }

        return winStart != -1 ? source.substring(winStart, winEnd + 1) : "";
    }


}
