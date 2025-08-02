public int[] withoutTen(int[] nums) {
  int[] result = new int[nums.length];
  int writeIndex = 0;

  for (int i= 0; i < nums.length; i++) {
    if (nums[i] != 10) {
      result[writeIndex]= nums[i];
      writeIndex++;
    }
  }
  return result;
}

