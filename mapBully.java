public Map<String, String> mapBully(Map<String, String> info) {
  if (info.containsKey("a")) {
    String aValue = info.get("a");
    info.put("b", aValue);
    info.put("a", "");
  }
  return info;
}

