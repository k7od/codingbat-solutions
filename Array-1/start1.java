public int start1(int[] a, int[] b) {
  int start = 0;
  if (a.length >0 && a[0] == 1) {
    start = start + 1;
  }
  if (b.length >0 && b[0] == 1) {
    start = start + 1;
  }
  return start;
}

