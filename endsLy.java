public boolean endsLy(String str) {
  if (str.length() < 2) {
    return false;
  }
  String lastTwo = str.substring(str.length() - 2);
  if (lastTwo.equals("ly")) {
    return true;
  }
  return false;
}

