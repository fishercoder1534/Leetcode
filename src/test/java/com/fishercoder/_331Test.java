package com.fishercoder;

import com.fishercoder.solutions._331;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/29/17.
 */
public class _331Test {
    private static _331 test;

    @BeforeClass
    public static void setup(){
        test = new _331();
    }

    @Test
    public void test1(){
        assertEquals(true, test.isValidSerialization_clever_solution("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        assertEquals(true, test.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    public void test2(){
        assertEquals(false, test.isValidSerialization_clever_solution("1,#"));
        assertEquals(false, test.isValidSerialization("1,#"));
    }

    @Test
    public void test3(){
        assertEquals(false, test.isValidSerialization_clever_solution("9,#,#,1"));
        assertEquals(false, test.isValidSerialization("9,#,#,1"));
    }

    @Test
    public void test4(){
        assertEquals(false, test.isValidSerialization_clever_solution("1"));
        assertEquals(false, test.isValidSerialization("1"));
    }

    @Test
    public void test5(){
        assertEquals(true, test.isValidSerialization_clever_solution("#,7,6,9,#,#,#"));
    }

}
