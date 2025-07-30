public int[] fix34(int[] nums) {
  int fourIndex= 0;
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 3 && nums[i + 1] != 4) {
      while (nums[fourIndex] != 4 || (fourIndex> 0 && nums[fourIndex - 1] == 3)) fourIndex++;
      int tmp = nums[i + 1];
      nums[i + 1] = 4;
      nums[fourIndex] = tmp;
    }
  }
  return nums;
}

