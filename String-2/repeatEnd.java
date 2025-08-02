public String repeatEnd(String str, int n) {
  String part = str.substring(str.length() - n);
  String result = "";
  
  for (int i= 0; i < n; i++) {
    result= result+ part;
  }
  return result;
}

