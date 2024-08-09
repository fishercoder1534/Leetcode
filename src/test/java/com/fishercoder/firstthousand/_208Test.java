package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._208;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _208Test {
    private _208.Solution1.Trie trie;

    @Test
    public void test1() {
        trie = new _208.Solution1.Trie();
        trie.insert("apple");
        assertEquals(true, trie.search("apple"));
        assertEquals(false, trie.search("app"));
        assertEquals(true, trie.startsWith("app"));
        trie.insert("app");
        assertEquals(true, trie.search("app"));
    }

    @Test
    public void test2() {
        trie = new _208.Solution1.Trie();
        trie.insert("fisher");
        trie.insert("coder");
        trie.insert("apple");
        trie.insert("april");
        trie.insert("cad");
        assertEquals(true, trie.search("fisher"));
        assertEquals(true, trie.search("apple"));
        assertEquals(true, trie.search("coder"));
        assertEquals(true, trie.search("april"));
        assertEquals(true, trie.search("cad"));
    }

}
