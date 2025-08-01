public int countPairs(String str) {
  if (str.length()<3){
    return 0;
  }
  char first= str.charAt(0);
  char third= str.charAt(2);
  int rest= countPairs(str.substring(1));
  
  if(first==third){
    return 1+rest;
  }
  else{
    return rest;
  }
}

