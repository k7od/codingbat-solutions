public List<String> lower(List<String> strings) {
  strings.replaceAll(w -> w.toLowerCase());
  return strings;
}
