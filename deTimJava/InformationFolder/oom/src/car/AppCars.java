package car;

import car.Car;

public class AppCars {

    public static void main(String[] args) {

        Car audi = new Car("FD BT 3333", 0, 10, 1, 100);

        for (int i = audi.getGasVolume(); i >= 0; i--) {
            audi.drive();
        }
    }
}
