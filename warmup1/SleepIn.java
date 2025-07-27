public class SleepIn{
    public boolean SleepIn(boolean weekday, boolean vacation) {
        boolean sleep;
        if (!weekday || vacation) {
            sleep = true;
        } else {
            sleep = false;
        }
        return sleep;
    }
}

