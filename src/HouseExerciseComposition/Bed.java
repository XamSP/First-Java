package HouseExerciseComposition;

public class Bed {

    private String mattress;

    private String headBoard;

    public Bed(String mattress, String headBoard){
        this.mattress = mattress;
        this.headBoard = headBoard;
    }

    public Bed(String mattress){
        this(mattress, "Generic");
    }

    public String getMattress() {
        return mattress;
    }

    public String getHeadBoard() {
        return headBoard;
    }
}
