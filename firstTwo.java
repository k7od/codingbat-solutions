public String firstTwo(String word) {
  if (word.length() < 2) {
    return word;
  }
  return word.substring(0, 2);
}

