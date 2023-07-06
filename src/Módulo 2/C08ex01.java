import java.util.Scanner;
public class C08ex01 {
    public static void main(String[] args) {
        double raio, area;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 9; aux++) {
            System.out.println("Informe o raio do círculo: ");
            raio = teclado.nextDouble();
            area = 3.1416 * Math.pow(raio, 2);
            System.out.println("Raio = " + raio + "Área = " + area);
        }
        teclado.close();
    }
}
