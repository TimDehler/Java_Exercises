package pyramid;

public class Pyramid {

    private double lengthA;
    private double heightH;
    private double volume = 0;
    private double surface = 0;

    public Pyramid(double lengthA, double heightH) {
        this.lengthA = lengthA;
        this.heightH = heightH;
    }

    public Pyramid() {
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getHeightH() {
        return heightH;
    }

    public void setHeightH(double heightH) {
        this.heightH = heightH;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "lengthA = " + lengthA +
                ", heightH = " + heightH +
                ", volume = " + volume +
                ", surface = " + surface +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public double getSurface() {
        return surface;
    }

    public void findVolume(){
        volume = ((lengthA*lengthA)*heightH)/3;
    }

    public void findSurface(){
        surface = (lengthA*lengthA)+2*lengthA*heightH;
    }
}
