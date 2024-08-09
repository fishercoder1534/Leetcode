package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._917;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _917Test {
    private _917.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
