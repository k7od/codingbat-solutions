public boolean groupSumClump(int start, int[] nums, int target) {
 int i = start;
 int sum = 0;
 

 while (i < nums.length && nums[i] == nums[start]) {
    sum += nums[i];
    i++;
 }
 if (start >= nums.length) {
   return target == 0; 
 }
 else{
    return groupSumClump(i,nums,target - sum) || groupSumClump(i,nums,target);
  }
}
