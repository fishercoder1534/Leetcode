// Two sum

var Solution1 = function (nums, target) {
  var sum = {}
  for (var i = 0; i < nums.length; i++) {
    if (!Object.prototype.hasOwnProperty.call(sum, (target - nums[i]))) {
      sum[nums[i]] = i
    } else {
      return [i, sum[target - nums[i]]]
    }
  }
}

var Solution2 = function (nums, target) {
  var  p1 = 0
  var  p2 = nums.length - 1
  while (p1 < p2){
    if (nums[p1] + nums[p2] < target) {
      p1 += 1
    }
    else if (nums[p1] + nums[p2] > target) {
      p2 -= 1
    }
    else {
      return [ p1, p2]  
    }
  }
}

console.log(Solution1([2, 7, 11, 15], 9))
console.log(Solution2([2, 7, 11, 15], 9))
