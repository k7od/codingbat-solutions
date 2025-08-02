public int[] copyEndy(int[] nums, int count) {
  int[] endyNums = new int[count];
  int found = 0;
  for (int i = 0; i < nums.length && found < count; i++) {
    if (isEndy(nums[i])) {
      endyNums[found] = nums[i];
      found++;
    }
  }
  return endyNums;
}
public boolean isEndy(int n) {
  if (n >= 0 && n <= 10) {
    return true;
  }
  if (n >= 90 && n <= 100) {
    return true;
  }
  return false;
}

