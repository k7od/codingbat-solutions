public boolean nearTen(int num) {
  int rem = num % 10;
  if (rem <= 2) {
    return true;
  }
  if (rem >= 8) {
    return true;
  }
  return false;
}

