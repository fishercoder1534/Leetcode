package com.fishercoder;

import com.fishercoder.solutions._1366;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1366Test {
    private static _1366.Solution1 solution1;
    private static String[] votes;

    @Test
    public void test1() {
        solution1 = new _1366.Solution1();
        votes = new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"};
        assertEquals("ACB", solution1.rankTeams(votes));
    }

    @Test
    public void test2() {
        solution1 = new _1366.Solution1();
        votes = new String[]{"WXYZ", "XYZW"};
        assertEquals("XWYZ", solution1.rankTeams(votes));
    }

    @Test
    public void test3() {
        solution1 = new _1366.Solution1();
        votes = new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"};
        assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK", solution1.rankTeams(votes));
    }

    @Test
    public void test4() {
        solution1 = new _1366.Solution1();
        votes = new String[]{"BCA", "CAB", "CBA", "ABC", "ACB", "BAC"};
        assertEquals("ABC", solution1.rankTeams(votes));
    }

    @Test
    public void test5() {
        solution1 = new _1366.Solution1();
        votes = new String[]{"M", "M", "M", "M"};
        assertEquals("M", solution1.rankTeams(votes));
    }

}