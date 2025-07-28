public Map<String, String> mapAB2(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    String first = map.get("a");
    String second = map.get("b");
    if (first.equals(second)) {
      map.remove("a");
      map.remove("b");
    }
  }
  return map;
}

