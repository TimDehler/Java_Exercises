package race;

public class Race {

    public static void main(String[] args) {
        Race race = new Race();
        race.testObject();
        race.race();
    }

    public void testObject() {
        Vehicle test = new Vehicle();
        System.out.println(test);
    }

    public void race(){
        Bike bike = new Bike(80.0,20.0,0.0,0);
        Car car = new Car(0.0,150.0);
        RaceCar raceCar = new RaceCar(0.0,200.0);
        Ambulance ambulance = new Ambulance(0.0,80.0,false);

        bike.drive(60);
        System.out.println(bike);
        car.drive(60);
        System.out.println(car);
        raceCar.drive(60);
        System.out.println(raceCar);
        ambulance.setElights(true);
        ambulance.drive(60);
        System.out.println(ambulance);

    }
}
