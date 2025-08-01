public boolean splitOdd10(int[] nums) {
  return helper(0,0,0, nums);
}
public boolean helper(int index, int sum1, int sum2, int[] nums) {
  if (index== nums.length) {
    return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1);
  }
  else{
    return helper(index + 1, sum1 + nums[index], sum2, nums) || helper(index+1,sum1,sum2 + nums[index],nums);
  }
}

