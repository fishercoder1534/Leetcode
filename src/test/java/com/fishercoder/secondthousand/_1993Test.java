package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.secondthousand._1993;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1993Test {
    private _1993.Solution1.LockingTree lockingTree;

    @BeforeEach
    public void setup() {}

    @Test
    public void test1() {
        lockingTree = new _1993.Solution1.LockingTree(new int[] {-1, 0, 0, 1, 1, 2, 2});
        assertTrue(lockingTree.lock(2, 2));
        assertFalse(lockingTree.unlock(2, 3));
        assertTrue(lockingTree.unlock(2, 2));
        assertTrue(lockingTree.lock(4, 5));
        assertTrue(lockingTree.upgrade(0, 1));
        assertFalse(lockingTree.lock(0, 1));
    }

    @Test
    public void test2() {
        lockingTree = new _1993.Solution1.LockingTree(new int[] {-1, 0, 3, 1, 0});
        assertFalse(lockingTree.upgrade(4, 5));
        assertFalse(lockingTree.upgrade(3, 8));
        assertFalse(lockingTree.unlock(0, 7));
        assertTrue(lockingTree.lock(2, 7));
        assertFalse(lockingTree.upgrade(4, 6));
    }

    @Test
    public void test3() {
        lockingTree = new _1993.Solution1.LockingTree(new int[] {-1, 4, 9, 0, 6, 1, 0, 6, 3, 1});
        assertFalse(lockingTree.upgrade(9, 43));
        assertFalse(lockingTree.upgrade(4, 27));
        assertFalse(lockingTree.upgrade(5, 34));
        assertFalse(lockingTree.upgrade(7, 31));
        assertFalse(lockingTree.upgrade(4, 27));
        assertTrue(lockingTree.lock(2, 47));
        assertFalse(lockingTree.unlock(7, 21));
        assertTrue(lockingTree.upgrade(4, 12));
        assertFalse(lockingTree.upgrade(1, 1));
        assertFalse(lockingTree.upgrade(8, 20));
        assertTrue(lockingTree.lock(5, 50));
        assertFalse(lockingTree.upgrade(8, 28));
        assertTrue(lockingTree.upgrade(0, 11));
        assertFalse(lockingTree.upgrade(6, 19));
        assertTrue(lockingTree.lock(9, 27));
        assertFalse(lockingTree.unlock(5, 6));
        assertFalse(lockingTree.upgrade(0, 5));
        assertFalse(lockingTree.unlock(4, 49));
        assertFalse(lockingTree.unlock(4, 42));
        assertFalse(lockingTree.upgrade(5, 27));
    }
}
