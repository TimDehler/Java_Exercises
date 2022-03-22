package race;

public class Vehicle {

    private double position;
    private double speed;
    private double maxSpeed = 0;
    private int tireCount = 0;

    public Vehicle(double position, double speed, double maxSpeed, int tireCount) {
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.tireCount = tireCount;
    }

    public Vehicle() {
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getTireCount() {
        return tireCount;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTireCount(int tireCount) {
        this.tireCount = tireCount;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "position= " + position +
                ", speed= " + speed +
                ", maxSpeed= " + maxSpeed +
                ", tireCount= " + tireCount +
                '}';
    }

    public void drive(double minutes) {
        if (speed > 0) {
            for (double i = minutes; i > 0; i--) {
                position = position + (speed / 60);
            }
        } else {
            System.out.println("You are not driving! Speed: " + speed);
        }
    }
}
