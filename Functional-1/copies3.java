public List<String> copies3(List<String> list) {
  list.replaceAll(w -> w + w + w);
  return list;
}

