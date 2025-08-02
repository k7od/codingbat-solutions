public String doubleChar(String str) {
  String result = "";
  
  for (int i =0; i < str.length(); i++) {
    String cha = str.substring(i, i + 1);
    result= result+ cha + cha;
  }
  return result;
}

