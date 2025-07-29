public boolean makeBricks(int small, int big, int goal) {
      int bigUse = goal / 5;
    
      if (bigUse > big) {
        bigUse = big;
      }
      
      int remaining = goal - (bigUse * 5);
    
      if (small >= remaining) {
        return true;
      } else if (small < remaining) {
        return false;
      } else {
        return false;
      }
    }

