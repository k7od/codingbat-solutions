public boolean noTriples(int[] nums) {
  int i =0;
  while(i<nums.length-2){
    if (nums[i]== nums[i + 1] && nums[i]== nums[i + 2]){
      return false;
    }
    i++;
  }
  return true;
}

