package com.stevesun;

import com.stevesun.solutions.LicenseKeyFormatting;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LicenseKeyFormattingTest {
    private static LicenseKeyFormatting test;
    private static String expected;
    private static String actual;
    private static String S;
    private static int k;

    @BeforeClass
    public static void setup(){
        test = new LicenseKeyFormatting();
    }

    @Before
    public void setupForEachTest(){
        expected = "";
        actual = "";
    }

    @Test
    public void test1(){
        S = "2-4A0r7-4k";
        k = 4;
        expected = "24A0-R74K";
        actual = test.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        S = "2-4A0r7-4k";
        k = 3;
        expected = "24-A0R-74K";
        actual = test.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        S = "--a-a-a-a--";
        k = 2;
        expected = "AA-AA";
        actual = test.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        S = "---";
        k = 3;
        expected = "";
        actual = test.licenseKeyFormatting(S, k);
        assertEquals(expected, actual);
    }
}
