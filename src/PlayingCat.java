public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;

        int lowerLimit = 25;

        if (temperature <= upperLimit && temperature >= lowerLimit) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        isCatPlaying(true, 40);
    }
}
