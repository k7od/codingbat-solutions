public List<String> noX(List<String> strings) {
  strings.replaceAll(w -> w.replace("x", ""));
  return strings;
}

