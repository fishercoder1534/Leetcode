package com.fishercoder;

import com.fishercoder.solutions._1286;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1286Test {
    private static _1286.Solution1.CombinationIterator combinationIterator;

    @Test
    public void test1() {
        combinationIterator = new _1286.Solution1.CombinationIterator("abc", 2);
        assertEquals("ab", combinationIterator.next());
        assertEquals(true, combinationIterator.hasNext());
        assertEquals("ac", combinationIterator.next());
        assertEquals(true, combinationIterator.hasNext());
        assertEquals("bc", combinationIterator.next());
        assertEquals(false, combinationIterator.hasNext());
    }

    @Test
    public void test2() {
        combinationIterator = new _1286.Solution1.CombinationIterator("abc", 3);
        assertEquals("abc", combinationIterator.next());
        assertEquals(false, combinationIterator.hasNext());
    }

    @Test
    public void test3() {
        combinationIterator = new _1286.Solution1.CombinationIterator("abcd", 3);
        assertEquals("abc", combinationIterator.next());
        assertEquals(true, combinationIterator.hasNext());
        assertEquals("abd", combinationIterator.next());
        assertEquals(true, combinationIterator.hasNext());
        assertEquals("acd", combinationIterator.next());
        assertEquals(true, combinationIterator.hasNext());
        assertEquals("bcd", combinationIterator.next());
        assertEquals(false, combinationIterator.hasNext());
    }

}