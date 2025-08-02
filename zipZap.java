public String zipZap(String str) {
  String result = "";

  for (int i = 0; i < str.length(); i++) {
    if (i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
      result += "zp";
      i= i+2;
    } else {
      result=result+str.charAt(i);
    }
  }
  return result;
}

