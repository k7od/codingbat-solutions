public int scoresAverage(int[] scores) {
  
  int mid = scores.length / 2;
  int firstAverage = average(scores, 0, mid - 1);
  int secondAverage = average(scores, mid, scores.length - 1);

  if (firstAverage > secondAverage) {
    return firstAverage;
  } else {
    return secondAverage;
  }
}

int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i <= end; i++) {
    sum=sum+scores[i];
  }
  return sum / (end-start+1);
}

