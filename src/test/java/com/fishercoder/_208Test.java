package com.fishercoder;

import com.fishercoder.solutions._208;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _208Test {
    private static _208.Solution1.Trie trie;

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

}
