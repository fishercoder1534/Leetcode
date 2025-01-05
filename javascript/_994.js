function orangesRotting(grid) {
  const rows = grid.length;
  const cols = grid[0].length;
  let queue = [];
  let freshOranges = 0;

  // Initialize the queue with all rotten oranges and count fresh oranges
  for (let r = 0; r < rows; r++) {
      for (let c = 0; c < cols; c++) {
          if (grid[r][c] === 2) {
              queue.push([r, c]);
          } else if (grid[r][c] === 1) {
              freshOranges++;
          }
      }
  }

  // If there are no fresh oranges, return 0
  if (freshOranges === 0) return 0;

  let minutes = 0;
  const directions = [
      [0, 1], // right
      [1, 0], // down
      [0, -1], // left
      [-1, 0] // up
  ];

  // Step 2: Perform BFS
  while (queue.length > 0) {
      let size = queue.length;
      let newRotten = false;

      for (let i = 0; i < size; i++) {
          let [x, y] = queue.shift();

          for (let [dx, dy] of directions) {
              let nx = x + dx;
              let ny = y + dy;

              // Check if the neighboring cell is a fresh orange
              if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && grid[nx][ny] === 1) {
                  grid[nx][ny] = 2; // Make it rotten
                  freshOranges--; // Decrease count of fresh oranges
                  queue.push([nx, ny]); // Add it to the queue
                  newRotten = true;
              }
          }
      }

      // If rotten oranges exist, increment minutes
      if (newRotten) minutes++;
  }

 // Check if there are any fresh oranges left
  return freshOranges === 0 ? minutes : -1;
}
