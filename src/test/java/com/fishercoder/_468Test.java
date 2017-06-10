package com.fishercoder;

import com.fishercoder.solutions._468;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/10/17.
 */
public class _468Test {
    private static _468 test;

    @BeforeClass
    public static void setup(){
        test = new _468();
    }

    @Test
    public void test1(){
        assertEquals("IPv4", test.validIPAddress("172.16.254.1"));
    }

    @Test
    public void test2(){
        assertEquals("IPv6", test.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

    @Test
    public void test3(){
        assertEquals("Neither", test.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
    }

    @Test
    public void test4(){
        assertEquals("Neither", test.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void test5(){
        assertEquals("Neither", test.validIPAddress("256.256.256.256"));
    }

    @Test
    public void test6(){
        assertEquals("Neither", test.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }

    @Test
    public void test7(){
        assertEquals("Neither", test.validIPAddress("01.01.01.01"));
    }

    @Test
    public void test8(){
        assertEquals("Neither", test.validIPAddress("00.0.0.0"));
    }

    @Test
    public void test9(){
        assertEquals("Neither", test.validIPAddress("000.0.0.0"));
    }

    @Test
    public void test10(){
        assertEquals("Neither", test.validIPAddress("0000.0.0.0"));
    }

    @Test
    public void test11(){
        assertEquals("IPv4", test.validIPAddress("0.0.0.0"));
    }

    @Test
    public void test12(){
        assertEquals("Neither", test.validIPAddress("1081:db8:85a3:01:-0:8A2E:0370:7334"));
    }

    @Test
    public void test13(){
        assertEquals("Neither", test.validIPAddress("1081:db8:85a3:01:z:8A2E:0370:7334"));
    }

}
