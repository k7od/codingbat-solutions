public String mixString(String a, String b) {
  String result = "";
  int minLen = Math.min(a.length(), b.length());

  for (int i = 0; i < minLen; i++) {
    result= result+ a.charAt(i);
    result= result+ b.charAt(i);
  }
  result= result+a.substring(minLen);
  result=result+ b.substring(minLen);

  return result;
}

