public class Graus {
    public static double graus(double graus, String conversor) {
        double gc, gf, gk;
        gc = graus;
        gf = (gc * 9) /5 + 32;
        gk = gc + 273;
        if (conversor.equalsIgnoreCase("kelvin")) {
            return gk;
        }
        else {
            return gf;
        }
    }

}


