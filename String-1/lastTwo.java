public String lastTwo(String str) {
  if (str.length() < 2) {
    return str;
  }
  String start = str.substring(0, str.length() - 2);
  char a = str.charAt(str.length() - 2);
  char b = str.charAt(str.length() - 1);
  return start+b+a;
}

