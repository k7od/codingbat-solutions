public String sameEnds(String string) {
  String res= "";
  for (int i = 0; i < string.length() / 2; i++) {
    String start= string.substring(0, i+1);
    String end= string.substring(string.length()- i-1);
    if(start.equals(end)){
      res = start;
    }
  }
    return res;
}

