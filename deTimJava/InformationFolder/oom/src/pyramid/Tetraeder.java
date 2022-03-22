package pyramid;

public class Tetraeder extends Pyramid {

    public Tetraeder(double lengthA, double heightH) {
        super(lengthA, heightH);
    }

    public Tetraeder() {
    }

    @Override
    public void findVolume() {
        double volume = (getLengthA()*getLengthA()*getLengthA())/12 * Math.sqrt(2);
        setVolume(volume);
    }

    @Override
    public void findSurface() {
        double surface = getLengthA()*getLengthA()*Math.sqrt(3);
        setSurface(surface);
    }

    @Override
    public String toString() {
        return "Tetraeder{" +
                "lengthA = " + getLengthA() +
                ", heightH = " + getHeightH() +
                ", volume = " + getVolume() +
                ", surface = " + getSurface() +
                '}';
    }
}
