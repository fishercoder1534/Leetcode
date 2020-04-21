package com.fishercoder.common.classes;

import java.util.ArrayList;
import java.util.List;

public class BinaryMatrixImpl implements BinaryMatrix {

    private final int[][] matrix;

    public BinaryMatrixImpl(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int get(int x, int y) {
        return matrix[x][y];
    }

    @Override
    public List<Integer> dimensions() {
        List<Integer> dimensions = new ArrayList<>();
        dimensions.add(matrix.length);
        dimensions.add(matrix[0].length);
        return dimensions;
    }
}
