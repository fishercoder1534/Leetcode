package com.stevesun;

import com.stevesun.solutions.StudentAttendanceRecordI;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StudentAttendanceRecordITest {
    private static StudentAttendanceRecordI test;
    private static boolean expected;
    private static boolean actual;
    private static String s;

    @BeforeClass
    public static void setup(){
        test = new StudentAttendanceRecordI();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        s = "ALLAPPL";
        expected = false;
        actual = test.checkRecord(s);
        assertEquals(expected, actual);
    }
}
