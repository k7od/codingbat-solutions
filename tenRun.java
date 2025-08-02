public int[] tenRun(int[] nums) {
  int multiple = 0;
  boolean run = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      multiple = nums[i];
      run = true;}
    else if (run) {
      nums[i] = multiple;
    }
  }
  return nums;
}

