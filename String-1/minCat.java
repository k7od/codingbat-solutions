public String minCat(String a, String b) {
  int len = Math.min(a.length(), b.length());
  String part1 = a.substring(a.length() - len);
  String part2 = b.substring(b.length() - len);
  return part1+part2;
}

