package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._929;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _929Test {
    private _929.Solution1 solution1;
    private static String[] emails;

    @BeforeEach
    public void setup() {
        solution1 = new _929.Solution1();
    }

    @Test
    public void test1() {
        emails =
                new String[] {
                    "test.email+alex@leetcode.com",
                    "test.e.mail+bob.cathy@leetcode.com",
                    "testemail+david@lee.tcode.com"
                };
        assertEquals(2, solution1.numUniqueEmails(emails));
    }
}
