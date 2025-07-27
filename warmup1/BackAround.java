public String backAround(String str) {
  String lastChar = str.substring(str.length() - 1);
  String result = lastChar + str + lastChar;
  return result;
}

