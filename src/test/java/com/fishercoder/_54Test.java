package com.fishercoder;

import com.fishercoder.solutions._54;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/13/17.
 */
public class _54Test {
    private static _54 test;
    private static int[][] matrix;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup(){
        test = new _54();
    }

    @Test
    public void test1(){
        matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        expected = new ArrayList(Arrays.asList(1,2,3,6,9,8,7,4,5));
        assertEquals(expected, test.spiralOrder(matrix));
    }
}
