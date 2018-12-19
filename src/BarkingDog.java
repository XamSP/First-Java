public class BarkingDog {
    public static boolean bark(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else if (hourOfDay >= 0 && hourOfDay < 8
                || hourOfDay > 22 && hourOfDay <= 23) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        bark(true, -1);
    }
}
