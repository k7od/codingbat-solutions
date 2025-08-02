public boolean sameStarChar(String str) {
  int i = 1;
  
  while (i< str.length() - 1) {
    if (str.charAt(i) == '*') {
      char before = str.charAt(i-1);
      char after = str.charAt(i+1);
      if (before != after) {
        return false;
      }
    }
    i++;
  }
  return true;
}

