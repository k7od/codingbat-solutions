public int sum13(int[] nums) {
  int sum = 0;
  int i = 0;
  
  while(i<nums.length){
    if(nums[i]==13){
      i=i+2;
    }
    else{
      sum=sum+nums[i];
      i++;
    }
  }
  return sum;
}

