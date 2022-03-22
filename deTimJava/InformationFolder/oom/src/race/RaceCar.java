package race;

public class RaceCar extends Car {

    public RaceCar(double position, double speed) {
        super(position, speed);
        setMaxSpeed(220.0);
    }

    public RaceCar() {
    }
}
