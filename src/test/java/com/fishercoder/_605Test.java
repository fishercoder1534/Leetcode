package com.fishercoder;

import com.fishercoder.solutions._605;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/4/17.
 */
public class _605Test {
    private static _605 test;
    private static int[] flowerbed;
    private static int n;

    @BeforeClass
    public static void setup(){
        test = new _605();
    }

    @Test
    public void test1(){
        flowerbed = new int[]{1,0,0,0,1};
        n = 1;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test2(){
        flowerbed = new int[]{1,0,0,0,1};
        n = 2;
        assertEquals(false, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test3(){
        flowerbed = new int[]{1,0,0,0,0,1};
        n = 2;
        assertEquals(false, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test4(){
        flowerbed = new int[]{1,0,1,0,1,0,1};
        n = 1;
        assertEquals(false, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test5(){
        flowerbed = new int[]{0,0,1,0,1};
        n = 1;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test6(){
        flowerbed = new int[]{1,0,0,0,1,0,0};
        n = 2;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test7(){
        flowerbed = new int[]{0,0,1,0,0};
        n = 2;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test8(){
        flowerbed = new int[]{1};
        n = 0;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test9(){
        flowerbed = new int[]{0};
        n = 0;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test10(){
        flowerbed = new int[]{0};
        n = 1;
        assertEquals(true, test.canPlaceFlowers(flowerbed, n));
    }
}
