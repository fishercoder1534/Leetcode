package com.fishercoder;

import com.fishercoder.solutions._294;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/29/17.
 */
public class _294Test {
    private static _294 test;

    @BeforeClass
    public static void setup() {
        test = new _294();
    }

    @Test
    public void test1() {
        assertEquals(true, test.canWin("++++"));
    }
}
