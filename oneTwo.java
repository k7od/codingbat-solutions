public String oneTwo(String str) {
   String result = "";
   
   
   for (int i = 0; i + 2 < str.length(); i += 3) {
    result= result+str.charAt(i + 1);
    result= result+ str.charAt(i + 2);
    result= result+str.charAt(i);
  }
  return result;
}

