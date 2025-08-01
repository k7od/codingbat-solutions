public boolean splitArray(int[] nums) {
  return helper(0,0,0, nums);
}
public boolean helper(int i,int sum1,int sum2,int[] nums) {
  if (i == nums.length) {
    return sum1== sum2;
  }
  else {
    return helper(i+1,sum1 + nums[i], sum2,nums) || helper(i+1, sum1, sum2 + nums[i],nums);
  }
}

