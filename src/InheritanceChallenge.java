public class InheritanceChallenge {
    public static class Vehicle {
        private int wheels;
        private String engine;

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

        private boolean steering;
        private boolean changingGears;
        private int speed;

        public Ford(String engine, boolean steering, boolean changingGears, int speed){
            super(engine);
            this.steering = steering;
            this.changingGears = changingGears;
            this.speed = speed;
        }

        public Ford(boolean steering, boolean changingGears, int speed) {
            this("Ford Engine", steering, changingGears, speed);
        }

        public void decreaseSpeed(int speed) {
            this.speed = this.speed - speed;
        }

        public void increaseSpeed(int speed) {
            this.speed = this.speed + speed;
        }

        public void setChangingGears() {
            this.changingGears = this.changingGears ? false : true;
        }

        public void setSteering() {
            this.steering = this.steering ? false : true;
        }

        public boolean isSteering() {
            return steering;
        }

        public boolean isChangingGears() {
            return changingGears;
        }

        public int getSpeed() {
            return speed;
        }
    }


    public static void main(String[] args) {
        Ford fordFiesta = new Ford(false, false, 120);

        System.out.println(fordFiesta.getWheels() + " Wheels with a " + fordFiesta.getEngine() + ". Also with a speed of " + fordFiesta.getSpeed() + " mph.");

        fordFiesta.increaseSpeed(40);

        System.out.println("Speed increased by 40 and now is " + fordFiesta.getSpeed() + " mph.");

        System.out.println("Car's gears: " + fordFiesta.isChangingGears() + ". And is Car steering: " + fordFiesta.isSteering() + ".");

        fordFiesta.setChangingGears();

        fordFiesta.setSteering();

        System.out.println("Car's gears: " + fordFiesta.isChangingGears() + ". And is Car steering: " + fordFiesta.isSteering() + ".");

        fordFiesta.decreaseSpeed(50);

        System.out.println("Speed decreased by 50 and now is " + fordFiesta.getSpeed() + " mph.");

    }
}
