public class InheritanceChallenge {
    public static class Vehicle {
        int wheels;
        String engine;

        public Vehicle(int wheels) {
            this(wheels, "Normal Engine");
        }

        public Vehicle(int wheels, String engine) {
            this.wheels = wheels;
            this.engine = engine;
        }

        public int getWheels() {
            return wheels;
        }

        public String getEngine() {
            return engine;
        }
    }

    public static class Car extends Vehicle {

        public Car(String engine){
            super(4, engine);
        }

        public Car(){
            super(4);
        }
    }

    public static class Ford extends Car {

        boolean steering;
        boolean changingGears;
        int speed;

        public Ford(String engine, boolean steering, boolean changingGears, int speed){
            super(engine);
            this.steering = steering;
            this.changingGears = changingGears;
            this.speed = speed;
        }

        public Ford(boolean steering, boolean changingGears, int speed) {
            this("Ford Engine", steering, changingGears, speed);
        }

    }


    public static void main(String[] args) {
        Ford ford = new Ford(true, true, 120);

        System.out.println(ford.getWheels() + " Wheels with a " + ford.getEngine() + ". Also with a speed of " + +);
    }
}
