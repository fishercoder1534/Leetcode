package com.fishercoder;

import com.fishercoder.solutions._1119;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1119Test {
    private static _1119.Solution1 solution1;
    private static _1119.Solution2 solution2;
    private static String S;

    @BeforeClass
    public static void setup() {
        solution1 = new _1119.Solution1();
        solution2 = new _1119.Solution2();
    }

    @Test
    public void test1() {
        S = "leetcodeisacommunityforcoders";
        assertEquals("ltcdscmmntyfrcdrs", solution1.removeVowels(S));
        assertEquals("ltcdscmmntyfrcdrs", solution2.removeVowels(S));
    }

    @Test
    public void test2() {
        S = "aeiou";
        assertEquals("", solution1.removeVowels(S));
        assertEquals("", solution2.removeVowels(S));
    }

}