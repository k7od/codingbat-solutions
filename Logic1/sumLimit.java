public int sumLimit(int a, int b) {
  int sum = a + b;
  String sumStr = sum + "";
  String aStr = a + "";
  
  if (sumStr.length() == aStr.length()) {
    return sum;
  }
  return a;
}

