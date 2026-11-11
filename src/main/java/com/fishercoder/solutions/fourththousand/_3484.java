package com.fishercoder.solutions.fourththousand;

public class _3484 {
    public static class Solution1 {
        class Spreadsheet {
            int rows;
            int[][] sheet;

            public Spreadsheet(int rows) {
                this.rows = rows;
                this.sheet = new int[rows + 1][26]; // this problem is 1-indexed, so need to add one here
            }

            public void setCell(String cell, int value) {
                int colIndex = cell.charAt(0) - 'A';
                int rowIndex = Integer.parseInt(cell.substring(1));
                this.sheet[rowIndex][colIndex] = value;
            }

            public void resetCell(String cell) {
                int colIndex = cell.charAt(0) - 'A';
                int rowIndex = Integer.parseInt(cell.substring(1));
                this.sheet[rowIndex][colIndex] = 0;
            }

            public int getValue(String formula) {
                String[] operands = formula.substring(1).split("\\+");
                return parseOperand(operands[0]) + parseOperand(operands[1]);
            }

            private int parseOperand(String operand) {
                if (Character.isAlphabetic(operand.charAt(0))) {
                    //it's a cell reference
                    int colIndex = operand.charAt(0) - 'A';
                    int rowIndex = Integer.parseInt(operand.substring(1));
                    return this.sheet[rowIndex][colIndex];
                } else {
                    //it's a number
                    return Integer.parseInt(operand);
                }
            }
        }

    }
}
