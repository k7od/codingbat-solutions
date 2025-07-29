public int[] makeLast(int[] nums) {
  int[] neArr = new int[nums.length * 2];
  neArr[neArr.length - 1] = nums[nums.length - 1];
  return neArr;
}

