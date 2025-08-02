public boolean more14(int[] nums) {
  int count1= 0;
  int count4= 0;
  int num = 0;
  
  while(num <nums.length) {
    if (nums[num] == 1) {
      count1++;
    }
    if (nums[num] == 4) {
      count4++;
    }
    num++;
  }
  
  return count1 > count4;
}

