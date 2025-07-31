public boolean gHappy(String str) {
  int i = 0;
  while (i < str.length()) {
    if (str.charAt(i) == 'g') {
      if (i + 1 < str.length() && str.charAt(i + 1) == 'g') {
        i= i+ 2; }
      else if (i > 0 && str.charAt(i - 1) == 'g') {
        i++; }
      else {
        return false;
      } }
      else {
      i++;
    }
  }
  return true;
}

