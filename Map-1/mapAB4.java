public Map<String, String> mapAB4(Map<String, String> info) {
  String a = info.get("a");
  String b = info.get("b");

  if (a != null && b != null) {
    if (a.length() == b.length()) {
      info.put("a", "");
      info.put("b", ""); }
    else if (a.length() > b.length()) {
      info.put("c", a); }
    else {
      info.put("c", b);
    }
  }
  return info;
}

