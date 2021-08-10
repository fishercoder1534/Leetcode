package com.fishercoder;

import com.fishercoder.solutions._1209;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1209Test {

    private static _1209.Solution1 solution1;
    private static _1209.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1209.Solution1();
        solution2 = new _1209.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("abcd", solution1.removeDuplicates("abcd", 2));
        assertEquals("abcd", solution2.removeDuplicates("abcd", 2));
    }

    @Test
    public void test2() {
        assertEquals("aa", solution1.removeDuplicates("deeedbbcccbdaa", 3));
        assertEquals("aa", solution2.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    public void test3() {
        assertEquals("ps", solution1.removeDuplicates("pbbcggttciiippooaais", 2));
        assertEquals("ps", solution2.removeDuplicates("pbbcggttciiippooaais", 2));
    }

    @Test
    public void test4() {
        assertEquals("ghayqgq", solution1.removeDuplicates("ghanyhhhhhttttttthhyyyyyynnnnnnyqkkkkkkkrrrrrrjjjjjjjryyyyyyfffffffygq", 7));
        assertEquals("ghayqgq", solution2.removeDuplicates("ghanyhhhhhttttttthhyyyyyynnnnnnyqkkkkkkkrrrrrrjjjjjjjryyyyyyfffffffygq", 7));
    }

}