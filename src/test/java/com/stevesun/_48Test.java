package com.stevesun;

import com.stevesun.solutions._48;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by stevesun on 5/8/17.
 */
public class _48Test {
    private static _48 test;
    private static int[][] matrix;

    @BeforeClass
    public static void setup(){
        test = new _48();
    }

    @Test
    public void test1(){
        matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        test.rotate_On(matrix);
    }
}
