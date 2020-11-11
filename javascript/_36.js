// Author: Phuong Lam

/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function (board) {
  var valid = [[], [], []]
  for (var i = 0; i < 9; i++) {
    valid[0][i] = []
    for (var j = 0; j < 9; j++) {
      if (board[i][j] !== '.') {
        const val = board[i][j]
        const pos = Math.floor(i / 3) * 3 + Math.floor(j / 3)

        if (!valid[1][j]) valid['1'][j] = []
        if (!valid[2][pos]) valid['2'][pos] = []

        if (valid[0][i][val]) return false
        if (valid[1][j][val]) return false
        if (valid[2][pos][val]) return false

        valid[0][i][val] = 1
        valid[1][j][val] = 1
        valid[2][pos][val] = 1
      }
    }
  }
  return true
}
