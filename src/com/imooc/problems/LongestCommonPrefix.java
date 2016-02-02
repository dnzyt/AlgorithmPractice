package com.imooc.problems;

/**
 * Created by ningzed on 2/2/16.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        int minLength = strs[0].length();
        for (String str: strs) {
            minLength = minLength < str.length() ? minLength : str.length();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char temp = strs[0].charAt(i);
            for (String str: strs) {
                if (temp != str.charAt(i))
                    return sb.toString();
            }
            sb.append(temp);
        }



        return sb.toString();
    }

    /*Nine Chapter Solution*/
    /*
    * public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            while( j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            if( j == 0) {
                return "";
	}
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
    *
    *
    *
    *
    *
    * */
}
