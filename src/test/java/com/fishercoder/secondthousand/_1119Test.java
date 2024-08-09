package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1119;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1119Test {
    private _1119.Solution1 solution1;
    private _1119.Solution2 solution2;
    private static String S;

    @BeforeEach
    public void setup() {
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