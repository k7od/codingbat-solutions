public int last2(String str) {
  if (str.length() < 2) return 0;
  String end = str.substring(str.length() - 2);
  int count = 0;
  int i= 0;
  
  while(i<str.length() -2) {
    if(str.substring(i,i+2).equals(end)) count++;
    i++;
  }
  return count;
}

