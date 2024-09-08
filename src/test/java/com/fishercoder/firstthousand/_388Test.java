package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._388;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _388Test {
    private _388.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _388.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                10,
                solution1.lengthLongestPath(
                        "dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext"));
    }

    @Test
    public void test2() {
        assertEquals(
                9, solution1.lengthLongestPath("dir\\n\\tsubdir1\\n\\tsubdir2\\n\\t\\tfile.ext"));
    }

    @Test
    public void test3() {
        assertEquals(7, solution1.lengthLongestPath("aaaaaaaaaaaaaaaaaaaaa/sth.png"));
    }

    @Test
    public void test4() {
        assertEquals(9, solution1.lengthLongestPath("a/aa/aaa/file1.txt"));
    }

    @Test
    public void test5() {
        assertEquals(25, solution1.lengthLongestPath("file name with  space.txt"));
    }

    @Test
    public void test6() {
        assertEquals(13, solution1.lengthLongestPath("dir\\n    file.txt"));
    }

    @Test
    public void test7() {
        assertEquals(12, solution1.lengthLongestPath("dir\n    file.txt"));
    }

    @Test
    public void test8() {
        assertEquals(
                7,
                solution1.lengthLongestPath("a\\n\\tb1\\n\\t\\tf1.txt\\n\\taaaaa\\n\\t\\tf2.txt"));
    }
}
