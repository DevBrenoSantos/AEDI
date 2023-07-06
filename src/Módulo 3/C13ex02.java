
public class C13ex02 {
    public static double funcao (double x) {
        double num, den, resultado = 0;
        if (x < 4) {
            num = 5 * x + 3;
            den = Math.sqrt(16 - Math.pow(x, 2));
            resultado = num/den;
        }
        if (x == 4) {
            resultado = 0;
        }
        if (x > 4) {
            num = 5 * x + 3;
            den = Math.sqrt(Math.pow(x, 2) - 16);
            resultado = num/den;
        }
        return resultado;
    }

}
