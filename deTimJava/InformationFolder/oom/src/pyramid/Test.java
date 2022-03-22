package pyramid;

public class Test {

    public static void main(String[] args) {

        Pyramid pyramid = new Pyramid(15.0,25.0);
        pyramid.findVolume();
        pyramid.findSurface();
        System.out.println(pyramid);

        Cone cone = new Cone(20.0,13.0);
        cone.findSurface();
        cone.findVolume();
        System.out.println(cone);

        Tetraeder tetraeder = new Tetraeder(15.0,25.0);
        tetraeder.findSurface();
        tetraeder.findVolume();
        System.out.println(tetraeder);
    }
}
