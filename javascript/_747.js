var dominantIndex = function(nums) {
      var maxdata = -1;
  var maxIndex = -1
  

  for( var i = 0 ;  i < nums.length; i++){
      if(nums[i] > maxdata){
          maxdata = nums[i];
          maxIndex = i
      }
  }
 
  for(var i = 0 ; i < nums.length; i++){
      
      if(i != maxIndex && nums[i] * 2 > maxdata){
           return  -1

      }
      
  }
    return maxIndex;
};

