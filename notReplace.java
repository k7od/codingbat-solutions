public String notReplace(String str) {
  String res= "";
  for (int i = 0; i < str.length(); i++) {
    if (i+ 1 < str.length() && str.substring(i, i + 2).equals("is")
    && (i== 0 || !Character.isLetter(str.charAt(i - 1)))
    && (i+ 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
      res= res + "is not";
      i++; }
    else {
      res= res+ str.charAt(i);
    }
  }
  return res;
}

