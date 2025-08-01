public boolean split53(int[] nums) {
  return check(0,0,0,nums);
}
public boolean check(int i,int a,int b,int[] nums) {
  if (i == nums.length) {
    return a == b;
  }
    int x = nums[i];
    if (x % 5 == 0) {
      return check(i + 1, a + x, b, nums);
    }
    else if (x % 3 == 0) {
      return check(i + 1, a, b + x, nums);
    }

  else{ 
    return check(i+1, a+x, b,nums) || check(i+1,a,b+x, nums);
    
  }
}
