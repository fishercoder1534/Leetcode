// Author: Phuong Lam

/**
 * @param {number[]} nums
 * @return {number}
 */
var waysToMakeFair = function (nums) {
  var total = 0

  var lo = 0 // left odd
  var le = 0 // left even
  var ro = 0 // right odd
  var re = 0 // right even

  // when ignore 1 element => right odd mean i % 2 === 0
  for (i = 0; i < nums.length; i++) {
    if (i % 2 === 0) ro += nums[i]
    else re += nums[i]
  }

  // remove position i, recalculate left - right even-odd
  for (i = 0; i < nums.length; i++) {
    // recalculate left
    if (i > 0) {
      if (i % 2 === 0) lo += nums[i - 1]
      else le += nums[i - 1]
    }

    // recalculate right
    if (i % 2 === 0) ro -= nums[i]
    else re -= nums[i]

    // calc total even & odd
    if (lo + ro === le + re) total++
  }
  return total
}
