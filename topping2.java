public Map<String, String> topping2(Map<String, String> info) {
  if (info.get("ice cream") != null) {
    info.put("yogurt", info.get("ice cream"));
  }
  if (info.get("spinach") != null) {
    info.put("spinach", "nuts");
  }
  return info;
}

