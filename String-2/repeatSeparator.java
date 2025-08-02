public String repeatSeparator(String word, String sep, int count) {
  if (count == 0) {
    return "";
  }

  String result = word;
  int i = 1;

  while (i < count) {
    result= result+ sep + word;
    i++;
  }
  return result;
}

