public boolean has12(int[] nums) {
  
  boolean found1 = false;
  int i =0;
  
  while(i< nums.length) {
    if (nums[i] == 1) {
      found1 = true;
    }
    if (found1 && nums[i] == 2) {
      return true;
    }
    i++;
  }
  return false;
}

