public String stringX(String str) {
    String result = "";

  if (str.length() <= 2) {
    return str;
  }
  for (int i = 1; i < str.length() - 1; i++) {
    if (str.charAt(i) != 'x') { 
      result= result+ str.charAt(i);
    }
  }
  return str.charAt(0) + result + str.charAt(str.length() - 1);
}

