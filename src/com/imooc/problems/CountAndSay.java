package com.imooc.problems;

/**
 * Created by dnzyt on 10/25/2015.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String[] res = new String[n];
        res[0] = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String s = res[i - 1];
            int count = 0;
            char t = s.charAt(0);
            for (int j = 0; j < s.length(); j++) {
                if (t == s.charAt(j)) {
                    count++;
                } else {
                    String r = count + "" + t;
                    sb.append(r);
                    count = 1;
                    t = s.charAt(j);
                }
            }
            sb.append(count + "" + t);
            res[i] = sb.toString();
        }
        return res[n - 1];
    }


}
