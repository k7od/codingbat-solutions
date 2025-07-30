public int[] fix45(int[] nums) {
  int pos5 = 0;
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] ==4 && nums[i + 1] !=5) {
      while (nums[pos5] != 5 || (pos5 > 0 && nums[pos5 - 1] == 4)) pos5++;
      int temp = nums[i + 1];
      nums[i+1] = nums[pos5];
      nums[pos5] = temp;
    }
  }
  return nums;
}

