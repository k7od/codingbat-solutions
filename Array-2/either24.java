public boolean either24(int[] nums) {
  
  boolean has22 = false;
  boolean has44 = false;
  int i= 0;
  
  while(i< nums.length - 1) {
    if (nums[i] == 2 && nums[i+1] == 2) {
      has22= true;
    }
    if (nums[i] == 4 && nums[i+1] == 4) {
      has44= true;
    }
    i++;
  }
  return has22 != has44; 
}

