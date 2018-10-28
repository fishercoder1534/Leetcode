package com.fishercoder;

import com.fishercoder.solutions._929;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _929Test {
    private static _929.Solution1 solution1;
    private static String[] emails;

    @BeforeClass
    public static void setup() {
        solution1 = new _929.Solution1();
    }

    @Test
    public void test1() {
        emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        assertEquals(2, solution1.numUniqueEmails(emails));
    }

}
