package com.fishercoder.common.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fishercoder1534 on 9/30/16.
 */
public class UndirectedGraphNode {
    public int val;
    public List<UndirectedGraphNode> neighbors;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UndirectedGraphNode that = (UndirectedGraphNode) o;

        if (val != that.val) {
            return false;
        }
        return neighbors != null ? neighbors.equals(that.neighbors) : that.neighbors == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (neighbors != null ? neighbors.hashCode() : 0);
        return result;
    }

    public UndirectedGraphNode(int x) {
        val = x;
        neighbors = new ArrayList<>();
    }
}
