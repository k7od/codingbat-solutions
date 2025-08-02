public boolean xyBalance(String str) {
  int lastY = -1;
  
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'y') {
      lastY = i;
    }
  }
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x' && i > lastY){
      return false;
    }
  }
  return true;
}

