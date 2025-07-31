public boolean equalIsNot(String str) {
  int couIs = 0;
  int couNot = 0;
  for (int i= 0; i < str.length() - 1; i++) {
    if (str.substring(i,i + 2).equals("is")) couIs++;
  }
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i,i + 3).equals("not")) couNot++;
  }
  return couIs == couNot;
}

