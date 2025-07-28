public List<Integer> square(List<Integer> num) {
  num.replaceAll(n -> n * n);
  return num;
}
