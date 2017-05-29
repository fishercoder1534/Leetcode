package com.fishercoder;

import com.fishercoder.solutions._533;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/25/17.
 */
public class _533Test {
    private static _533 test;
    private static char[][] picture;

    @BeforeClass
    public static void setup(){
        test = new _533();
    }

    @Test
    public void test1(){
        picture = new char[][]{
                {'W', 'B', 'W', 'B', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'B', 'W'},
                {'W', 'W', 'B', 'W', 'B', 'W'}};
        assertEquals(6, test.findBlackPixel(picture, 3));
    }

//    @Test
//    public void test2(){
//        picture = new char[][]{{'B'}};
//        assertEquals(1, test.findBlackPixel(picture, 1));
//    }
}
