/**
 * @param {number[]} nums
 * @return {number}
 */

var findNumbers = function (nums) {
  let result = 0
  for (let i = 0; i < nums.length; i++) {
    const num = String(nums[i])
    if (num.length % 2 === 0) result++
  }
  return result
}

console.log(findNumbers([12, 345, 2, 6, 7896]))
