package com.stevesun.solutions;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int height = board.length, width = board[0].length;
        int[][] next = new int[height][width];
        
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                        int liveCellsCount = 0;
                        //count all its live cells
                        
                        if(j+1 < width && board[i][j+1] == 1) liveCellsCount++;//right cell
                        if(j-1 >= 0 && board[i][j-1] == 1) liveCellsCount++;//left cell
                        if(i+1 < height && board[i+1][j] == 1) liveCellsCount++;//down cell
                        if(i-1 >= 0 && board[i-1][j] == 1) liveCellsCount++;//up cell
                        if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) liveCellsCount++;//up left cell
                        if(i-1 >= 0 && j+1 < width && board[i-1][j+1] == 1) liveCellsCount++;//up right cell
                        if(i+1 < height && j-1 >= 0 && board[i+1][j-1] == 1) liveCellsCount++;//down left cell
                        if(i+1 < height && j+1 < width && board[i+1][j+1] == 1) liveCellsCount++;//down right cell
                        
                        if(board[i][j] == 1){
                            if(liveCellsCount > 3 || liveCellsCount < 2) {
                                next[i][j] = 0;
                            } else {
                                next[i][j] = 1;
                            }
                        } else if(board[i][j] == 0) {
                            if(liveCellsCount == 3){
                                next[i][j] = 1;
                            }
                        } 
                }
            }
            
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    board[i][j] = next[i][j];
                }
            }
    }
}
