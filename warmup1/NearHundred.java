public boolean nearHundred(int n) {
  int diff1 = Math.abs(100 - n);
  int diff2 = Math.abs(200 - n);
  if (diff1 <= 10 || diff2 <= 10) {
    return true;
  } else {
    return false;    
  }
}


