public boolean mixStart(String str) {
  if (str.length() < 3) {
    return false;
  }
  String part = str.substring(1, 3);
  if (part.equals("ix")) {
    return true;
  }
  return false;
}
