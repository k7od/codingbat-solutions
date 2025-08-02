public String[] fizzArray2(int n) {
  String[] result = new String[n];
  int i = 0;
  
  while (i<n) {
    result[i]= Integer.toString(i);
    i++;
  }
  return result;
}

