public Map<String, Integer> wordCount(String[] strings) {
  Map<String,Integer>map = new HashMap<>();
  for (String s: strings){
    Integer count = map.get(s);
    if(count==null){
      map.put(s,1);
    }
    else{
      map.put(s, count+1);
    }
  }
  return map;
}

