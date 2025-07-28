public String nTwice(String str, int n) {
  String start = str.substring(0, n);
  String end = str.substring(str.length() - n);

  return start + end;
}

