public boolean hasBad(String s) {
  if (s.length() >= 3) {
    String firstThree = s.substring(0, 3);
    if (firstThree.equals("bad")) {
      return true;
    }
  }
  if (s.length() >= 4) {
    String nextThree = s.substring(1, 4);
    if (nextThree.equals("bad")) {
      return true;
    }
  }
  return false;
}

