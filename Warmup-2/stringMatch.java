public int stringMatch(String a, String b) {
  int count= 0;
  int i = 0;
  int len = Math.min(a.length(),b.length());
  
  while(i<len-1){
    if(a.substring(i,i+2).equals(b.substring(i,i+2))){
      count++;
    }
    i++;
  }
  return count;
}

