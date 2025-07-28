public String left2(String str) {
  String firstTwo = str.substring(0, 2);
  String rest = str.substring(2);
  return rest + firstTwo;
}

