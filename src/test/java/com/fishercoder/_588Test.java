package com.fishercoder;

import com.fishercoder.solutions._588;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/23/17.
 */
public class _588Test {

    private static _588.Solution1.FileSystem fileSystem;

    @BeforeClass
    public static void setup() {
    }

    @Test
    public void test1() {
        fileSystem = new _588.Solution1.FileSystem();
        List<String> list = new ArrayList<>();
        assertEquals(list, fileSystem.ls("/"));
        fileSystem.mkdir("/a/b/c");
        fileSystem.addContentToFile("/a/b/c/d", "hello");
        list.add("a");
        assertEquals(list, fileSystem.ls("/"));
        assertEquals("hello", fileSystem.readContentFromFile("/a/b/c/d"));
    }

    @Test
    public void test2() {
        fileSystem = new _588.Solution1.FileSystem();
        List<String> list = new ArrayList<>();
        assertEquals(list, fileSystem.ls("/"));
        fileSystem.mkdir("/a/b/c");
        list.add("c");
        assertEquals(list, fileSystem.ls("/a/b"));
    }
}
