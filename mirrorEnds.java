public String mirrorEnds(String string) {
  String res = "";
  int i = 0;
  while (i < string.length()) {
    if (string.charAt(i) == string.charAt(string.length()- 1 - i)) {
      res= res+ string.charAt(i);
      i++; }
      else {
      break;
    }
  }
  return res;
}

