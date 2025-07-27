public boolean specialEleven(int n) {
  int mod = n % 11;
  if (mod == 0 || mod == 1) {
    return true;
  }
  return false;
}

