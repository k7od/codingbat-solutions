public int[] fizzArray3(int start, int end) {
   int size = end - start;
  int[] result = new int[size];
  int i = 0;
  
  while (i < size) {
    result[i] = start + i;
    i++;
  }
  return result;
}

