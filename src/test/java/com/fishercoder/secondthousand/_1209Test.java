package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1209;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1209Test {

    private _1209.Solution1 solution1;
    private _1209.Solution2 solution2;
    private _1209.Solution3 solution3;
    private _1209.Solution4 solution4;

    @BeforeEach
    public void setup() {
        solution1 = new _1209.Solution1();
        solution2 = new _1209.Solution2();
        solution3 = new _1209.Solution3();
        solution4 = new _1209.Solution4();
    }

    @Test
    public void test1() {
        assertEquals("abcd", solution1.removeDuplicates("abcd", 2));
        assertEquals("abcd", solution2.removeDuplicates("abcd", 2));
        assertEquals("abcd", solution3.removeDuplicates("abcd", 2));
        assertEquals("abcd", solution4.removeDuplicates("abcd", 2));
    }

    @Test
    public void test2() {
        assertEquals("aa", solution1.removeDuplicates("deeedbbcccbdaa", 3));
        assertEquals("aa", solution2.removeDuplicates("deeedbbcccbdaa", 3));
        assertEquals("aa", solution3.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    public void test3() {
        assertEquals("ps", solution1.removeDuplicates("pbbcggttciiippooaais", 2));
        assertEquals("ps", solution2.removeDuplicates("pbbcggttciiippooaais", 2));
        assertEquals("ps", solution3.removeDuplicates("pbbcggttciiippooaais", 2));
    }

    @Test
    public void test4() {
        assertEquals("ghayqgq", solution1.removeDuplicates("ghanyhhhhhttttttthhyyyyyynnnnnnyqkkkkkkkrrrrrrjjjjjjjryyyyyyfffffffygq", 7));
        assertEquals("ghayqgq", solution2.removeDuplicates("ghanyhhhhhttttttthhyyyyyynnnnnnyqkkkkkkkrrrrrrjjjjjjjryyyyyyfffffffygq", 7));
        assertEquals("ghayqgq", solution3.removeDuplicates("ghanyhhhhhttttttthhyyyyyynnnnnnyqkkkkkkkrrrrrrjjjjjjjryyyyyyfffffffygq", 7));
    }

}