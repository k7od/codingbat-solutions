public String right2(String str) {
  String st = str.substring(0,str.length() - 2);
  String en= str.substring(str.length() - 2);
  return en +st;
}

