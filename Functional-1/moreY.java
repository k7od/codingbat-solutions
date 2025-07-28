public List<String> moreY(List<String> strings) {
  strings.replaceAll(w -> "y" + w + "y");
  return strings;
}
