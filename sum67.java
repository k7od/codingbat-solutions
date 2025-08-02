public int sum67(int[] nums) {
  int sum= 0;
  int i= 0;
  
  while (i< nums.length) {
    if (nums[i] == 6) {
      while (nums[i] != 7) {
        i++;
      } }
    else {
      sum= sum+nums[i];
    }
    i++;
  }
  return sum;
}

