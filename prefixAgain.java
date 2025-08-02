public boolean prefixAgain(String str, int n) {
  String prefix = str.substring(0, n);
  int i = n;
  
  while (i <= str.length() - n) {
    if (str.substring(i,i+n).equals(prefix)) {
      return true;
    }
    i++;
  }
  return false;
}

