public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long hours =  (minutes - minutes % 60) /60;

            long days = (hours - hours % 24) /24;

            long years = (days - days % 365) /365;

            long remainingDays = days % 365;


            System.out.println(minutes + " min = " + years + " y and " + remainingDays+ " d");

        }

    }



    public static void main(String[] args) {

        printYearsAndDays(6000);

    }
}
