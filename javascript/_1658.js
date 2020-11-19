// Author: Phuong Lam

/**
 * @param {number[]} nums
 * @param {number} x
 * @return {number}
 */
var minOperations = function (nums, x) {
  const total = nums.reduce((a, b) => a + b)
  if (total === x) return nums.length

  var sum = 0
  var head = 0
  var max = -1
  for (var tail = 0; tail < nums.length; tail++) {
    sum += nums[tail]
    while (sum > total - x) {
      sum -= nums[head]
      head++
    }
    if (sum === total - x) max = Math.max(max, tail - head + 1)
  }

  return max === -1 ? -1 : nums.length - max
}
