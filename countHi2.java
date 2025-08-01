public int countHi2(String str) {
  int len= str.length();
  
  if (len<2) return 0;
  if (len>= 3 && str.substring(0, 3).equals("xhi")) {
    return countHi2(str.substring(3)); }
  else if (str.substring(0, 2).equals("hi")) {
    return 1 + countHi2(str.substring(2)); } 
  else {
    return countHi2(str.substring(1));
  }
}

