package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1656;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class _1656Test {
    private _1656.Solution1.OrderedStream orderedStream;

    @Test
    public void test1() {
        orderedStream = new _1656.Solution1.OrderedStream(5);
        assertEquals(Collections.emptyList(), orderedStream.insert(3, "ccccc"));
        assertEquals(Arrays.asList("aaaaa"), orderedStream.insert(1, "aaaaa"));
        assertEquals(Arrays.asList("bbbbb", "ccccc"), orderedStream.insert(2, "bbbbb"));
        assertEquals(Collections.emptyList(), orderedStream.insert(5, "eeeee"));
        assertEquals(Arrays.asList("ddddd", "eeeee"), orderedStream.insert(4, "ddddd"));
    }
}
