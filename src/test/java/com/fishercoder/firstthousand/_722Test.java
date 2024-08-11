package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._722;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _722Test {
    private _722.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _722.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("int main()", "{ ", "  ", "int a, b, c;", "a = b + c;", "}"), solution1.removeComments(new String[]{"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("ab"), solution1.removeComments(new String[]{"a/*comment", "line", "more_comment*/b"}));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("struct Node{", "    ", "    int size;", "    int val;", "};"),
                solution1.removeComments(new String[]{"struct Node{", "    /*/ declare members;/**/", "    int size;", "    /**/int val;", "};"}));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList("main() {", "   double s = 33;", "   cout << s;", "}"),
                solution1.removeComments(new String[]{"main() {", "/* here is commments", "  // still comments */", "   double s = 33;", "   cout << s;", "}"}));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList("void func(int k) {", "   k = k*2/4;", "   k = k/2;*/", "}"),
                solution1.removeComments(new String[]{"void func(int k) {", "// this function does nothing /*", "   k = k*2/4;", "   k = k/2;*/", "}"}));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList("a", "blank", "df"),
                solution1.removeComments(new String[]{"a//*b/*/c", "blank", "d/*/e/*/f"}));
    }

}
