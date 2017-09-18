package com.fishercoder;

import com.fishercoder.common.utils.ArrayUtils;
import com.fishercoder.solutions._675;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _675Test {
    private static _675.Solution1 solution1;
    private static List<List<Integer>> forest;

    @BeforeClass
    public static void setup() {
        solution1 = new _675.Solution1();
    }

    @Test
    public void test1() {
        forest = new ArrayList<>();
        forest.add(Arrays.asList(1, 2, 3));
        forest.add(Arrays.asList(0, 0, 4));
        forest.add(Arrays.asList(7, 6, 5));
        assertEquals(6, solution1.cutOffTree(forest));
    }

    @Test
    public void test2() {
        forest = new ArrayList<>();
        forest.add(Arrays.asList(1, 2, 3));
        forest.add(Arrays.asList(0, 0, 0));
        forest.add(Arrays.asList(7, 6, 5));
        assertEquals(-1, solution1.cutOffTree(forest));
    }

    @Test
    public void test3() {
        forest = new ArrayList<>();
        forest.add(Arrays.asList(2, 3, 4));
        forest.add(Arrays.asList(0, 0, 5));
        forest.add(Arrays.asList(8, 7, 6));
        assertEquals(6, solution1.cutOffTree(forest));
    }

    @Test
    public void test4() {
        forest = ArrayUtils.buildList(new int[][]{
                {2, 3, 4, 9},
                {0, 0, 5, 10},
                {8, 7, 6, 12},
        });
        assertEquals(13, solution1.cutOffTree(forest));
    }

    @Test
    public void test5() {
        forest = ArrayUtils.buildList(new int[][]{
                {0, 0, 0, 3528, 2256, 9394, 3153},
                {8740, 1758, 6319, 3400, 4502, 7475, 6812},
                {0, 0, 3079, 6312, 0, 0, 0},
                {6828, 0, 0, 0, 0, 0, 8145},
                {6964, 4631, 0, 0, 0, 4811, 0},
                {0, 0, 0, 0, 9734, 4696, 4246},
                {3413, 8887, 0, 4766, 0, 0, 0},
                {7739, 0, 0, 2920, 0, 5321, 2250},
                {3032, 0, 3015, 0, 3269, 8582, 0}});
        assertEquals(-1, solution1.cutOffTree(forest));
    }

    @Test
    public void test6() {
        forest = ArrayUtils.buildList(new int[][]{
                {54581641, 64080174, 24346381, 69107959},
                {86374198, 61363882, 68783324, 79706116},
                {668150, 92178815, 89819108, 94701471},
                {83920491, 22724204, 46281641, 47531096},
                {89078499, 18904913, 25462145, 60813308}
        });
        assertEquals(57, solution1.cutOffTree(forest));
    }

}
