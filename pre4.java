public int[] pre4(int[] nums) {
  int index= 0;
  
  while (nums[index] != 4) {
    index++;
  }
  
  int[] result = new int[index];
  int i = 0;
  
  while (i<index) {
    result[i] = nums[i];
    i++;
  }
  return result;
}

