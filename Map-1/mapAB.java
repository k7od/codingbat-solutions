public Map<String, String> mapAB(Map<String, String> data) {
  if (data.containsKey("a") && data.containsKey("b")) {
    String a = data.get("a");
    String b = data.get("b");
    data.put("ab", a + b);
  }
  return data;
}

