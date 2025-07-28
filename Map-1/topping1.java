public Map<String, String> topping1(Map<String, String> toppings) {
  if (toppings.containsKey("ice cream")) {
    toppings.put("ice cream", "cherry");
  }
  toppings.put("bread", "butter");
  return toppings;
}

