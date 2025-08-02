public boolean dividesSelf(int n) {
  for (int temp = n; temp > 0; temp /= 10) {
    
    int digit = temp % 10;
    if (digit == 0 || n % digit != 0) {
      return false;
    }
  }
  return true;
}

