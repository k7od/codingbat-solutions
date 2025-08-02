public int[] zeroMax(int[] nums) {
  for(int i= 0; i<nums.length;i++) {
    if (nums[i] == 0) {
      int maxOdd = 0;
      for (int k = i + 1; k < nums.length; k++) {
        if (nums[k] % 2 == 1 && nums[k] > maxOdd) {
          maxOdd= nums[k];
        }
      }
      nums[i]= maxOdd== 0 ? 0 : maxOdd;
    }
  }
  return nums;
}

