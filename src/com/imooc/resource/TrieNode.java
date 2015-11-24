package com.imooc.resource;

import java.util.HashMap;

/**
 * Created by dnzyt on 11/23/2015.
 */
public class TrieNode {
    public HashMap<Character, TrieNode> children;
    public boolean hasWord;

    public TrieNode() {
        children = new HashMap<>();
        hasWord = false;
    }
}
