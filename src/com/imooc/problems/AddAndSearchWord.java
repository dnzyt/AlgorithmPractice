package com.imooc.problems;

import com.imooc.resource.TrieNode;

import java.util.Map;

/**
 * Created by dnzyt on 11/23/2015.
 */
public class AddAndSearchWord {

    private TrieNode root = new TrieNode();


    public void addWord(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            if (!current.children.containsKey(word.charAt(i))) {
                current.children.put(word.charAt(i), new TrieNode());
            }
            current = current.children.get(word.charAt(i));
        }
        current.hasWord = true;
    }


    public boolean search(String word) {


        return findWord(word, 0, root);
    }

    private boolean findWord(String word, int index, TrieNode current) {
        if (index == word.length()) {
            if (current.hasWord)
                return true;
            else
                return false;
        }

        if (current.children.containsKey(word.charAt(index))) {
            if (index == word.length() - 1 && current.children.get(word.charAt(index)).hasWord)
                return true;
            return findWord(word, index + 1, current.children.get(word.charAt(index)));
        } else if (word.charAt(index) == '.') {
            boolean res = false;
            for (Map.Entry<Character, TrieNode> child: current.children.entrySet()) {
                if (index == word.length() - 1 && child.getValue().hasWord)
                    return true;
                if (findWord(word, index + 1, child.getValue())) {
                    res = true;
                    break;
                }
            }
            return res;
        } else {
            return false;
        }
    }

}


































