public class HIW {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1500;
        } else if (score > 500 && score < 1000) {
            return 900;
        } else if (score > 100 && score < 500) {
            return 400;
        } else {
            return 50;
        }
    }

    public static void main(String[] args){
        System.out.println("Hi");

        String name = "Max";
        int position = 5;
        int score = 800;

        displayHighScorePosition(name, position);

        System.out.println(calculateHighScorePosition(score));





    }
}

