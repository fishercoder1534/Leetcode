package com.fishercoder;

import com.fishercoder.solutions._676;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _676Test {
    private static _676.Solution1.MagicDictionary magicDictionarySol1;

    @BeforeClass
    public static void setup() {
        magicDictionarySol1 = new _676.Solution1.MagicDictionary();
    }

    @Before
    public void cleanup() {
        magicDictionarySol1 = new _676.Solution1.MagicDictionary();
    }

    @Test
    public void test1() {
        magicDictionarySol1.buildDict(new String[]{"hello", "leetcode"});
        assertEquals(false, magicDictionarySol1.search("hello"));
        assertEquals(true, magicDictionarySol1.search("hhllo"));
        assertEquals(false, magicDictionarySol1.search("hell"));
        assertEquals(false, magicDictionarySol1.search("leetcoded"));
    }
}
