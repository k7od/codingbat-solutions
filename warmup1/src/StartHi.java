public boolean startHi(String str) {
  if (str.length() >= 2) {
    String beginning = str.substring(0, 2);
    if (beginning.equals("hi")) {
      return true;
    }
  }
  return false;
}

