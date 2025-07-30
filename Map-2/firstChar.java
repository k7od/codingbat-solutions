public Map<String, String> firstChar(String[] strings) {
  Map<String,String> map= new HashMap<>();
  for(String s : strings) {
    String key= s.charAt(0) + "";
    map.put(key, map.getOrDefault(key, "") + s);
  }
  return map;
}

