public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (int i = 0; i < strings.length; i++) {
    String firstChar = strings[i].substring(0, 1);
    if (map.containsKey(firstChar)) {
      int j = map.get(firstChar);
      if (j != -1) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
        map.put(firstChar, -1);
      }
    } else {
      map.put(firstChar, i);
    }
  }
  return strings;
}

