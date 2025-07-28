public Map<String, String> topping3(Map<String, String> map) {
  String potato = map.get("potato");
  String salad = map.get("salad");
  if (potato != null) {
    map.put("fries", potato);
  }
  if (salad != null) {
    map.put("spinach", salad);
  }
  return map;

}

