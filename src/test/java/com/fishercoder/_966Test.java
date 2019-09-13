package com.fishercoder;

import com.fishercoder.solutions._966;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by varunu28 on 1/01/19.
 */


public class _966Test {
    private static _966.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _966.Solution1();
    }


    @Test
    public void test1() {
        assertEquals(
                    Arrays.toString(new String[]{"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"}),
                    Arrays.toString(solution1
                                    .spellchecker(
                                        new String[]{"KiTe","kite","hare","Hare"},
                                        new String[]{"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"})));
    }
}
