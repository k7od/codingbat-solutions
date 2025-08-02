public String[] fizzBuzz(int start, int end) {
  int size= end-start;
  String[] result= new String[size];

  for (int i= 0; i< size; i++) {
    int val = start + i;
    
    if (val % 15 == 0) {
      result[i] = "FizzBuzz"; } 
    else if (val % 3 == 0) {
      result[i] = "Fizz"; } 
    else if (val % 5 == 0) {
      result[i] = "Buzz"; }
    else {
      result[i] = String.valueOf(val);
    }
  }
  return result;
}

