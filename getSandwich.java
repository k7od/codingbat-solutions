public String getSandwich(String str) {
  if(str.indexOf("bread") == str.lastIndexOf("bread")) {
    return "";
  }

  int start = str.indexOf("bread") +5;
  int end = str.lastIndexOf("bread");

  return str.substring(start,end);
}

