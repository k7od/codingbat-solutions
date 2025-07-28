public String lastChars(String a, String b) {
  String firstChar = (a.length() == 0) ? "@" : a.substring(0, 1);
  String lastChar = (b.length() == 0) ? "@" : b.substring(b.length() - 1);
  return firstChar + lastChar;
}

