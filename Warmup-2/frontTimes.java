public String frontTimes(String str, int n) {
  String front = str.length()< 3 ? str : str.substring(0,3);
  String result = "";
  int i = 0;
  
  while(i<n){
    result = result +front;
    i++;
  }
  return result;
  
}

