public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(num-> num % 10);
  return nums;
}

