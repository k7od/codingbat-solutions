public boolean evenlySpaced(int x, int y, int z) {
  int little = Math.min(x, Math.min(y, z));
  int big = Math.max(x, Math.max(y, z));
  int mid = x + y + z - little - big;
  
  if ((mid - little) == (big - mid)) {
    return true; }
  else {
    return false;
  }
}

