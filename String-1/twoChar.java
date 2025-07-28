public String twoChar(String str, int ind) {
  if (ind < 0 || ind+1 >= str.length()) {
    return str.substring(0, 2); } 
  else {
    return str.substring(ind,ind+2);
  }
}

