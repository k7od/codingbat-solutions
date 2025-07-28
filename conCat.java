public String conCat(String a, String b) {
  if (a.length() == 0) {
    return b;
  }
  else if (b.length() == 0) {
    return a;
  }
  char last = a.charAt(a.length() - 1);
  char first = b.charAt(0);

  if (last == first) {
    return a + b.substring(1);
  }
  return a + b;
}

