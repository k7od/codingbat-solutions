public int array667(int[] nums) {
  int count = 0;
  int i = 0;
  
  while (i< nums.length - 1) {
    if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
      count++;
    }
    i++;
  }
  return count;
}

