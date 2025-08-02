public int[] evenOdd(int[] nums) {
  int[] result = new int[nums.length];
  int positive = 0;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      result[positive] = nums[i];
      positive++;
    }
  }

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 != 0) {
      result[positive] = nums[i];
      positive++;
    }
  }
  return result;
}

