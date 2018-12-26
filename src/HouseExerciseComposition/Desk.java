package HouseExerciseComposition;

public class Desk {

    private int width;

    private int length;

    private int height;

    private boolean chair;

    private String brand;

    public Desk(int width, int length, int height, boolean chair, String brand) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.chair = chair;
        this.brand = brand;
    }

    public Desk(int width, int length, int height, boolean chair) {
        this(width, length, height, chair, "General");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public boolean isChair() {
        return chair;
    }

    public String getBrand() {
        return brand;
    }
}
