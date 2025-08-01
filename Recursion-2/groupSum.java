public boolean groupSum(int start, int[] nums, int target) {
  if (start>=nums.length) {
    return target== 0;
  }
  else if(groupSum(start+1, nums, target - nums[start])) {
    return true;
  }
  else{
    return groupSum(start+1, nums, target);
  }
}

