package com.stevesun;

import com.stevesun.solutions._171;
import com.stevesun.solutions._48;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/13/17.
 */
public class _171Test {
    private static _171 test;

    @BeforeClass
    public static void setup(){
        test = new _171();
    }

    @Test
    public void test1(){
        assertEquals(28, test.titleToNumber("AB"));
    }
}
