public List<String> noYY(List<String> strings) {
  List<String> result = new ArrayList<>();
  for (String s : strings){
    result.add(s+"y");
  }
  result.removeIf(str->str.contains("yy"));
  return result;
  
}

