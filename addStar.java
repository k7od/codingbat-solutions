public List<String> addStar(List<String> strings) {
  strings.replaceAll(w -> w + "*");
  return strings;
}
