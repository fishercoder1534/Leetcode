var runningSum = function (nums) {

  for(var i = 0 ; i < nums.length -1 ; i++){
    nums[i+1] = nums[i] + nums[i+1]
  }
  return nums
}

console.log(runningSum([1,2,3,4]))