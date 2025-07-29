public int luckySum(int x, int y, int z) {
  if (x==13) {
    return 0; }
  else if (y==13) {
    return x; }
  else if (z==13) {
    return x + y; }
  else {
    return x + y + z;
  }
}

