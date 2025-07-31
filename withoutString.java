public String withoutString(String base, String remove) {
  String res = "";
  int i = 0;
  String loBase = base.toLowerCase();
  String loRemove = remove.toLowerCase();
  while (i< base.length()) {
    if (i + remove.length() <= base.length() &&
        loBase.substring(i, i + remove.length()).equals(loRemove)) {
      i= i+ remove.length(); }
    else {
      res= res+base.charAt(i);
      i++;
    }
  }
  return res;
}

