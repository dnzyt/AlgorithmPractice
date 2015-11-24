package com.imooc.problems;

import java.util.*;

/**
 * Created by ningzeda on 11/24/2015.
 * 先创建一个map，key用来存放排好序的字符序列，value用来存放这个字符序列的anagrams
 * 然后寻找map中元素数大于等于2的value，把value中的字符串加入到结果集中
 */
public class Anagrams {

    public List<String> anagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters);
            if (map.get(sorted) == null) {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(sorted, temp);
            } else {
                ArrayList<String> temp = map.get(sorted);
                temp.add(strs[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                for (String s: entry.getValue()) {
                    res.add(s);
                }
            }
        }


        return res;
    }
}
