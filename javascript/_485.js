var findMaxConsecutiveOnes = function (nums) {
  let slow = 0
  let fast = 0
  let max = 0
  while (fast < nums.length) {
    if (nums[fast] === 0) {
      if (fast - slow > max) {
        max = fast - slow
      }
      fast++
      slow = fast
    } else {
      fast++
    }
  }
  return fast - slow > max ? fast - slow : max
}

console.log(findMaxConsecutiveOnes([2, 7, 11, 15]))
