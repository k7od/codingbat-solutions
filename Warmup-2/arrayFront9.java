public boolean arrayFront9(int[] nums) {
  int end = nums.length;
  int i = 0;
  if (end > 4) end =3;
  while (i < end) {
    if (nums[i] == 9) {
      return true;
    }
    i++;
  }
  return false;
}

