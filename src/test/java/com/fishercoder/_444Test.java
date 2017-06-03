package com.fishercoder;

import com.fishercoder.solutions._444;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/3/17.
 */
public class _444Test {
    private static _444 test;
    private static int[] org;
    private static List<List<Integer>> seqs;

    @BeforeClass
    public static void setup(){
        test = new _444();
    }

    @Test
    public void test1(){
        org = new int[]{1,2,3};
        seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1,2));
        seqs.add(Arrays.asList(1,3));
        assertEquals(false, test.sequenceReconstruction(org, seqs));
    }
}
