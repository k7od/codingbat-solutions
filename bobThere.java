public boolean bobThere(String str) {
  
  for (int i= 0; i <= str.length() - 3;i++) {
    String part = str.substring(i,i+3);
    
    if (part.charAt(0)== 'b' && part.charAt(2)== 'b') {
      return true;
    }
  }
  return false;
}

