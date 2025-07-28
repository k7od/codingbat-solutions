public Map<String, String> mapAB3(Map<String, String> map) {
  String a = map.get("a");
  String b = map.get("b");

  if (a != null && b == null) {
    map.put("b", a); }
  else if (a == null && b != null) {
    map.put("a", b);
  }
  return map;
}

