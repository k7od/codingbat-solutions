public class makes10 {
    public boolean makes10(int a, int b) {
        boolean result;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}

