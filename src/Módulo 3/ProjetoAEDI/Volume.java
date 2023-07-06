
public class Volume {
    static double pi = 3.1416;
    public static double calculoV(double raio) {
        double volume;
        volume = ((4 / 3) * pi) * (Math.pow(raio,3));
        return volume;
    }
    public static double calculoA(double raio) {
        double area;
        area = 4 * pi * (Math.pow(raio,2));
        return area;
    }
}
