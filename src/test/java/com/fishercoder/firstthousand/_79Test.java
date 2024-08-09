package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._79;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _79Test {
    private _79.Solution1 solution1;
    private _79.Solution2 solution2;
    private _79.Solution3 solution3;
    private static char[][] board;

    @BeforeEach
    public void setup() {
        solution1 = new _79.Solution1();
        solution2 = new _79.Solution2();
        solution3 = new _79.Solution3();
    }

    @Test
    public void test1() {
        board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        assertEquals(true, solution1.exist(board, "ABCEFSADEESE"));
    }

    @Test
    public void test2() {
        board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        assertEquals(true, solution1.exist(board, "ABCCED"));

        assertEquals(true, solution1.exist(board, "SEE"));

        assertEquals(false, solution1.exist(board, "ABCD"));
    }

    @Test
    public void test3() {
        board = new char[][]{
                {'a'},
                {'a'},
        };
        assertEquals(false, solution1.exist(board, "aaa"));
    }

    @Test
    public void test4() {
        board = new char[][]{
                {'A', 'B', 'H', 'I'},
                {'K', 'E', 'H', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        assertEquals(true, solution2.exist(board, "ABHISHEK"));
    }

    @Test
    public void test5() {
        board = CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]");
        assertEquals(true, solution3.exist(board, "ABCCED"));
    }

}
