package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._824;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _824Test {
    private _824.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _824.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                "Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                solution1.toGoatLatin("I speak Goat Latin"));
    }

    @Test
    public void test2() {
        assertEquals(
                "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                solution1.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
