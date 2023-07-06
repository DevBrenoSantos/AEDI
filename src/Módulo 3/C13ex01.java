import java.util.Scanner;
public class C13ex01 {
    static double x1, x2, y1, y2;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de X1: ");
        x1 = teclado.nextDouble();
        System.out.print("Insira o valor de Y1: ");
        y1 = teclado.nextDouble();
        System.out.print("Insira o valor de X2: ");
        x2 = teclado.nextDouble();
        System.out.print("Insira o valor de Y2: ");
        y2 = teclado.nextDouble();
        System.out.print("Resultado: "+funcao(x1, y1, x2, y2));
        teclado.close();
    }
    static double funcao(double x1, double y1, double x2, double y2) {
        double distancia, v1, v2;
        v1 = x1 - x2;
        v2 = y1 - y2;
        distancia = Math.sqrt(Math.pow(v1, 2) + Math.pow(v2, 2));
        return distancia;
    }
}
