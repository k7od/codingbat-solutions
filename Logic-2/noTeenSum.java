public int noTeenSum(int a, int b, int c) {
  return value(a) + value(b) + value(c);
}
public int value(int n) {
  if (n >= 13 && n <= 19 && n != 15 && n != 16) {
    return 0;
  }
  return n;
}

