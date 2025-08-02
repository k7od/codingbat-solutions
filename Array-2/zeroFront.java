public int[] zeroFront(int[] nums) {
  
  int[] result = new int[nums.length];
  int zero = 0;

  for (int i= 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      result[zero] = 0;
      zero++;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
      result[zero] = nums[i];
      zero++;
    }
  }
  return result;
}

