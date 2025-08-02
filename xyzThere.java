public boolean xyzThere(String str) {
  int i = 0;
  
  while (i <= str.length() -3) {
    String sub = str.substring(i,i+3);
    if (sub.equals("xyz")) {
      if (i== 0 || str.charAt(i-1) != '.') {
        return true;
      }
    }
    i++;
  }
  return false;
}

