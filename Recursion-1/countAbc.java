public int countAbc(String str) {
  if (str.length()< 3){
    return 0;
  }
  else if (str.startsWith("abc") || str.startsWith("aba")) {
    return 1+ countAbc(str.substring(1));
  }
  else{
  return countAbc(str.substring(1));
  }
}

