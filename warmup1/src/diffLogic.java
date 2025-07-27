public class diffLogic {
    public int diff21(int n) {
        int diff;
        if (n <= 21) {
            diff= 21-n;
        } else {
            diff = (n - 21) * 2;
        }

        return diff;
    }

}

