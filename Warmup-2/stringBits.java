public String stringBits(String str) {
  String result = "";
  int i = 0;
  
  while(i< str.length()){
    result = result+ str.charAt(i);
    i= i+2;
  }
  return result;
}

