package com.fishercoder;

import com.fishercoder.solutions._1487;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1487Test {
    private static _1487.Solution1 solution1;
    private static String[] names;

    @BeforeClass
    public static void setup() {
        solution1 = new _1487.Solution1();
    }

    @Test
    public void test1() {
        names = new String[]{"pes", "fifa", "gta", "pes(2019)"};
        assertArrayEquals(new String[]{"pes", "fifa", "gta", "pes(2019)"}, solution1.getFolderNames(names));
    }

}