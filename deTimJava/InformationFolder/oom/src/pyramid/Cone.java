package pyramid;

public class Cone extends Pyramid {

    public Cone(double lengthA, double heightH) {
        super(lengthA, heightH);
    }

    public Cone() {
    }

    @Override
    public void findVolume() {
        double volume = Math.PI * (getLengthA() * getLengthA()) * getHeightH() / 3;
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Cone{" +
                "lengthA = " + getLengthA() +
                ", heightH = " + getHeightH() +
                ", volume = " + getVolume() +
                ", surface = " + getSurface() +
                '}';
    }

    @Override
    public void findSurface() {
        double generatrix = Math.sqrt(getHeightH() * getHeightH() + getLengthA() * getLengthA());
        double surface = Math.PI * getLengthA() * (getLengthA() + generatrix);
        setSurface(surface);


    }
}
