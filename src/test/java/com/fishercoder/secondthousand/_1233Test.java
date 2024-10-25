package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1233;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class _1233Test {
    private _1233.Solution1 solution1;
    private static String[] folder;

    @BeforeEach
    public void setup() {
        solution1 = new _1233.Solution1();
    }

    @Test
    public void test1() {
        folder = new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        ArrayList expected = new ArrayList();
        expected.add("/a");
        expected.add("/c/d");
        expected.add("/c/f");
        assertThat(expected).hasSameElementsAs(solution1.removeSubfolders(folder));
    }

    @Test
    public void test2() {
        folder = new String[]{"/a", "/a/b/c", "/a/b/d"};
        ArrayList expected = new ArrayList();
        expected.add("/a");
        assertThat(expected).hasSameElementsAs(solution1.removeSubfolders(folder));
    }
}
