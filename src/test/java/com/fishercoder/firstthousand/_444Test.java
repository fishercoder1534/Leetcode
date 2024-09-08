package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._444;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _444Test {
    private _444.Solution1 solution1;
    private static int[] org;
    private static List<List<Integer>> seqs;

    @BeforeEach
    public void setup() {
        solution1 = new _444.Solution1();
    }

    @Test
    public void test1() {
        org = new int[] {1, 2, 3};
        seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1, 2));
        seqs.add(Arrays.asList(1, 3));
        assertEquals(false, solution1.sequenceReconstruction(org, seqs));
    }
}
