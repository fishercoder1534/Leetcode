class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int rows[9][10];
        int cols[9][10];
        int boxes[9][10];
        memset(rows, 0, sizeof(rows));
        memset(cols, 0, sizeof(cols));
        memset(boxes, 0, sizeof(boxes));
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (++rows[i][num] > 1 || ++cols[j][num] > 1 || ++boxes[(i/3)*3 + j/3][num] > 1) return false;
                
                }
            }
        }
        return true;
    }
};
