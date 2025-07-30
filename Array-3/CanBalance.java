public boolean canBalance(int[] nums) {
  int sum = 0; 
  int left = 0;
  for (int n : nums) sum += n;
  for (int i = 0; i < nums.length; i++) {
    left += nums[i];
    if (left * 2 == sum) return true;
  }
  return false;
}

