package com.fishercoder;

import com.fishercoder.solutions._591;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _591Test {
    private static _591.Solution1 test;

    @BeforeClass
    public static void setup() {
        test = new _591.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, test.isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"));
    }

    @Test
    public void test2() {
        assertEquals(false, test.isValid("<ABCDEFGHIJKLMN>This is the first line <![CDATA[<div>]]></ABCDEFGHIJKLMN>"));//tag_name is too long (> 9)
    }
}
