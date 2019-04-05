package com.fishercoder;

import com.fishercoder.solutions._444;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _444Test {
    private static _444.Solution1 solution1;
    private static int[] org;
    private static List<List<Integer>> seqs;

    @BeforeClass
    public static void setup() {
        solution1 = new _444.Solution1();
    }

    @Test
    public void test1() {
        org = new int[]{1, 2, 3};
        seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1, 2));
        seqs.add(Arrays.asList(1, 3));
        assertEquals(false, solution1.sequenceReconstruction(org, seqs));
    }
}
