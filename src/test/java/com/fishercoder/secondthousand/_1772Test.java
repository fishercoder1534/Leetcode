package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1772;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1772Test {
    private _1772.Solution1 solution1;

    @BeforeEach
    public void setup() {
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