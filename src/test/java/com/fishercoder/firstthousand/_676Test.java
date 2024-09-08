package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._676;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _676Test {
    private _676.Solution1.MagicDictionary magicDictionarySol1;

    @BeforeEach
    public void setup() {
        magicDictionarySol1 = new _676.Solution1.MagicDictionary();
    }

    @BeforeEach
    public void cleanup() {
        magicDictionarySol1 = new _676.Solution1.MagicDictionary();
    }

    @Test
    public void test1() {
        magicDictionarySol1.buildDict(new String[] {"hello", "leetcode"});
        assertEquals(false, magicDictionarySol1.search("hello"));
        assertEquals(true, magicDictionarySol1.search("hhllo"));
        assertEquals(false, magicDictionarySol1.search("hell"));
        assertEquals(false, magicDictionarySol1.search("leetcoded"));
    }
}
