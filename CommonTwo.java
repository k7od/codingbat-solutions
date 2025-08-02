public int commonTwo(String[] a, String[] b) {
  int count = 0;
  int i = 0;
  int j = 0;
  
  while (i < a.length && j < b.length) {
    if (a[i].equals(b[j])) {
      if (i == 0 || !a[i].equals(a[i - 1])) {
        count++;
      }
      i++;
      j++;
    } else if (a[i].compareTo(b[j]) < 0) {
      i++;
    } else {
      j++;
    }
  }
  return count;
}

