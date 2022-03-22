package race;

public class Bike extends Vehicle {

    public Bike(double position, double speed, double maxSpeed, int tireCount) {
        super(position, speed, maxSpeed, tireCount);
    }

    public Bike() {
    }

    @Override
    public void setTireCount(int tireCount) {
        super.setTireCount(2);
    }

    @Override
    public void setMaxSpeed(double maxSpeed) {
        super.setMaxSpeed(30.0);
    }
}
