package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1745;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1745Test {
    private _1745.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1745.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkPartitioning("abcbdd"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.checkPartitioning("bcbddxy"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.checkPartitioning("juchzcedhfesefhdeczhcujzzvbmoeombv"));
    }

    @Test
    public void test4() {
        assertEquals(
                true,
                solution1.checkPartitioning(
                        "gbofdldvwelqiizbievfolrujxnwjmjwsjrjeqecwssgtlteltslfzkblzihcgwjnqaiqbxohcnxulxozzkanaofgoddogfoanakzzoxluxnchoxbqiaqnjwgchizlbkzflstletltgsswceqejrjswjmjwnxjurlofveibziiqlewvdldfobgxebrcrbexv"));
    }
}
