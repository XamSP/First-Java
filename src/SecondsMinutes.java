public class SecondsMinutes {

    public static void getDurationString(int minutes, int seconds) {
        if(minutes <= 0 || seconds <= 0 || seconds > 60) {
            System.out.println("Invalid value");
        }

        int remainingSeconds = seconds % 60;

        int remainingMinutes =  seconds > 59 ? ((seconds - remainingSeconds) / 60) + minutes % 60 : minutes % 60;

        int hours = minutes > 59 ? (minutes - remainingMinutes) / 60 : 0;

        System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
    }

    public static void getDurationString(int seconds) {
        if(seconds < 0) {
            System.out.println("Invalid value");
        }
        int remainingSeconds = seconds % 60;

        int remainingMinutes =  seconds > 59 ? ((seconds - remainingSeconds) / 60) : 0;

        getDurationString(remainingMinutes, remainingSeconds);
    }

    public static void main(String[] args) {
        getDurationString(121);
    }
}
