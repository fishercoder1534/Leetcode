package com.fishercoder;

import com.fishercoder.solutions._1772;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1772Test {
    private static _1772.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1772.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"touch", "cooler", "lock"},
                solution1.sortFeatures(new String[]{"cooler", "lock", "touch"}, new String[]{"i like cooler cooler", "lock touch cool", "locker like touch"}));
    }

    @Test
    public void test2() {

        assertArrayEquals(new String[]{"a", "aa", "b", "c"},
                solution1.sortFeatures(new String[]{"a", "aa", "b", "c"}, new String[]{"a", "a aa", "a a a a a", "b a"}));
    }

}