package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1487;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1487Test {
    private _1487.Solution1 solution1;
    private static String[] names;

    @BeforeEach
    public void setup() {
        solution1 = new _1487.Solution1();
    }

    @Test
    public void test1() {
        names = new String[] {"pes", "fifa", "gta", "pes(2019)"};
        assertArrayEquals(
                new String[] {"pes", "fifa", "gta", "pes(2019)"}, solution1.getFolderNames(names));
    }
}
