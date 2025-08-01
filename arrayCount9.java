public int arrayCount9(int[] nums) {
  int count = 0;
  int i= 0;
  
  while(i<nums.length){
    if(nums[i]==9){
      count++;
    }
    i++;
  }
  return count;
}

