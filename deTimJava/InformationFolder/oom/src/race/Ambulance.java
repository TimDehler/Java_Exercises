package race;

public class Ambulance extends Car {

    private boolean elights;

    public Ambulance(double position, double speed, boolean elights) {
        super(position, speed);
        this.elights = elights;
    }

    public void setElights(boolean eLights) {
        if (eLights) {
            System.out.println("Light!");
        } else {
            System.out.println("No light!");
        }
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "position= " + getPosition() +
                ", speed= " + getSpeed() +
                ", maxSpeed= " + getMaxSpeed() +
                ", tireCount= " + getTireCount() +
                ", elights=" + elights +
                '}';
    }
}
