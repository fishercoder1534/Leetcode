package com.fishercoder;

import com.fishercoder.solutions._187;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/3/17.
 */
public class _187Test {
    private static _187 test;
    private static String s;
    private static List<String> expected;
    private static List<String> actual;

    @BeforeClass
    public static void setup(){
        test = new _187();
    }

    @Test
    public void test1(){
        s = "AAAAAAAAAAA";
        System.out.println(s.length());
        actual = test.findRepeatedDnaSequences(s);
        expected = new ArrayList<>(Arrays.asList("AAAAAAAAAA"));
        System.out.println(expected.get(0).length());
        assertEquals(expected, actual);
    }
}
