public boolean tripleUp(int[] nums) {
  for (int i=0; i < nums.length - 2; i++) {
    int a= nums[i];
    int b= nums[i + 1];
    int c= nums[i + 2];
    if (a+1 == b && b+1 == c) {
      return true;
    }
  }
  return false;
}

