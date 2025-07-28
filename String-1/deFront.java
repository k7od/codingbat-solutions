public String deFront(String str) {
  String fix = "";
  
  if (str.length() > 1) {
    if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
      fix = "ab" + str.substring(2);
    } else if (str.charAt(0) == 'a') {
      fix = "a" + str.substring(2);
    } else if (str.charAt(1) == 'b') {
      fix = "b" + str.substring(2);
    } else {
      fix = str.substring(2);
    }
  } else if (str.length() == 1) {
    if (str.charAt(0) == 'a') {
      fix = "a";
    }
  }
  return fix;
}

