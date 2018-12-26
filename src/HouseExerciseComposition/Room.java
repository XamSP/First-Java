package HouseExerciseComposition;

public class Room {

    private Bed currentBed = new Bed("Purple");

    private Desk currentDesk = new Desk(20,8,15, true, "IKEA");

    private int area;

    public Room(Bed currentBed, Desk currentDesk, int area) {
        this.currentBed = currentBed;
        this.currentDesk = currentDesk;
        this.area = area;
    }

    public Room(Desk currentDesk, int area) {
        this.currentDesk = currentDesk;
        this.area = area;
    }

    public Room(Bed currentBed, int area) {
        this.currentBed = currentBed;
        this.area = area;
    }

    public Room(int area) {
        this.area = area;
    }

    public Bed getCurrentBed() {
        return currentBed;
    }

    public void setCurrentBed(Bed currentBed) {
        this.currentBed = currentBed;
    }

    public Desk getCurrentDesk() {
        return currentDesk;
    }

    public void setCurrentDesk(Desk currentDesk) {
        this.currentDesk = currentDesk;
    }

    public void printProperties() {
        System.out.println("The currentRoom's area is " + area + ", and the bed'd mattress is from " + getCurrentBed().getMattress() + ", and lastly, the desk is from " + getCurrentDesk().getBrand() + ".");
    }
}
