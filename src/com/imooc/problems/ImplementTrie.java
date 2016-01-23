package com.imooc.problems;

import com.imooc.resource.TrieNode;

/**
 * Created by dnzyt on 1/23/16.
 */
public class ImplementTrie {
    private TrieNode root;

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            if (!current.children.containsKey(word.charAt(i))) {
                TrieNode child = new TrieNode();
                current.children.put(word.charAt(i), child);
            }
            current = current.children.get(word.charAt(i));
        }
        current.hasWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            current = current.children.get(word.charAt(i));
            if (current == null)
                return false;
        }
        return current.hasWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            current = current.children.get(prefix.charAt(i));
            if (current == null)
                return false;
        }

        return true;
    }
}
