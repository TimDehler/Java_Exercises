package car;

public class Car {

    private String licensePlate;
    private int mileage;
    private int fuelVolume;
    private int gasUsage;
    private int gasVolume;

    public Car(String mark, int mileage, int fuelVolume, int gasUsage, int gasVolume) {
        this.licensePlate = mark;
        this.mileage = mileage;
        this.gasUsage = gasUsage;
        this.fuelVolume = fuelVolume;

        //Short if condition
        this.gasVolume = gasVolume > fuelVolume ? fuelVolume : gasVolume;
    }

    public Car() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getGasVolume() {
        return gasVolume;
    }

    public int getMileage() {
        return mileage;
    }

    public void drive() {
        if (gasVolume <= 0) {
            System.out.println("You cant drive you have to refuel!");
            refuel();
        } else if (gasVolume == 1) {
            System.out.println("REFUEL WARNING");
            gasVolume -= gasUsage;
            mileage += 1;
            System.out.println("Your car drove: " + mileage + " miles already!");
        } else {
            System.out.println("The car is driving!");
            gasVolume -= gasUsage;
            mileage += 1;
            System.out.println("Your car drove: " + mileage + " miles already!");
        }
    }

    public void refuel() {
        System.out.println("The car is refueling");
        for (int i = gasVolume; gasVolume <= fuelVolume; gasVolume++) {
            System.out.println("Current gas volume in tank: " + gasVolume);
        }
        System.out.println("Your tank is full!");
    }
}
