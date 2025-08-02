public int centeredAverage(int[] nums) {
  
  int sum= 0;
  int smallest= nums[0];
  int largest= nums[0];

  for (int num : nums) {
    sum= sum+num;
    if (num<smallest) {
      smallest= num;
    }
    if (num>largest) {
      largest= num;
    }
  }

  sum = sum-smallest-largest;
  return sum / (nums.length - 2);
}

