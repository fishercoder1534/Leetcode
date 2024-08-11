package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._591;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _591Test {
    private _591.Solution1 test;

    @BeforeEach
    public void setup() {
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
