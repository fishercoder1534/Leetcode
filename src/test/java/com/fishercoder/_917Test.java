package com.fishercoder;

import com.fishercoder.solutions._917;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _917Test {
    private static _917.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _917.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("dc-ba", solution1.reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void test2() {
        assertEquals("j-Ih-gfE-dCba", solution1.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    public void test3() {
        assertEquals("Qedo1ct-eeLg=ntse-T!", solution1.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

}
