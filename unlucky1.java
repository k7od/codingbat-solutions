public boolean unlucky1(int[] nums) {
  int leng= nums.length;

  if (leng >= 2){
    if(nums[0]==1 && nums[1]==3){
      return true;
    }
    else if (nums[1]== 1 && leng>2 && nums[2]==3){
      return true;
    }
    else if (nums[leng -2] ==1 && nums[leng-1]== 3){
      return true;
    }
  }
  return false;
}

