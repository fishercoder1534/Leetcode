function findWinner(skills, k) {
  // This solution uses a queue to process the matches.
  let n = skills.length;
  let maxSkill = Math.max(...skills); 
  let queue = []; 

  let currentWinner = 0; 
  let currentWins = 0;  

  for (let i = 1; i < n; i++) {
      if (skills[currentWinner] > skills[i]) {
          currentWins++; 
      } else {
          currentWinner = i;
          currentWins = 1;  
      }

      // If the champion has won k times or is the max skill player, return.
      if (currentWins >= k || skills[currentWinner] === maxSkill) {
          return currentWinner;
      }
  }

  return currentWinner;
}
