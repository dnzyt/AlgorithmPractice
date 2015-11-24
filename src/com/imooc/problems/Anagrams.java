package com.imooc.problems;

import java.util.*;

/**
 * Created by ningzeda on 11/24/2015.
 * �ȴ���һ��map��key��������ź�����ַ����У�value�����������ַ����е�anagrams
 * Ȼ��Ѱ��map��Ԫ�������ڵ���2��value����value�е��ַ������뵽�������
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
