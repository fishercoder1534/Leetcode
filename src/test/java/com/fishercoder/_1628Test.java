package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1628;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1628Test {
    private static _1628.Solution1.TreeBuilder treeBuilderSolution1;

    @BeforeClass
    public static void setup() {
        treeBuilderSolution1 = new _1628.Solution1.TreeBuilder();
    }

    @Test
    public void test1() {
        _1628.Solution1.Node node = treeBuilderSolution1.buildTree(new String[]{"3", "4", "+"});
        List<String> list = node.print(node, new ArrayList<>());
        CommonUtils.printList(list);
        assertEquals(7, node.evaluate());
    }

    @Test
    public void test2() {
        _1628.Solution1.Node node = treeBuilderSolution1.buildTree(new String[]{"3", "4", "+", "2", "*", "7", "/"});
        List<String> list = node.print(node, new ArrayList<>());
        CommonUtils.printList(list);
        assertEquals(2, node.evaluate());
    }

    @Test
    public void test3() {
        _1628.Solution1.Node node = treeBuilderSolution1.buildTree(new String[]{"4", "5", "2", "7", "+", "-", "*"});
        List<String> list = node.print(node, new ArrayList<>());
        CommonUtils.printList(list);
        assertEquals(-16, node.evaluate());
    }

    @Test
    public void test4() {
        _1628.Solution1.Node node = treeBuilderSolution1.buildTree(new String[]{"4", "2", "+", "3", "5", "1", "-", "*", "+"});
        List<String> list = node.print(node, new ArrayList<>());
        CommonUtils.printList(list);
        assertEquals(18, node.evaluate());
    }

}
