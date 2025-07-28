public List<Integer> math1(List<Integer> nums) {
  List<Integer> res = new ArrayList<>();
  for (Integer n : nums) {
    res.add((n + 1) * 10);
  }
  return res;
}


