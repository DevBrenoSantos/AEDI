import java.util.Scanner;
public class C05ex01 {
    public static void main(String[] args) {
        double fx, valor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o X: ");
        fx = teclado.nextDouble();
        valor = Math.sqrt (Math.pow(fx,3) + 4 * fx + 10);
        System.out.println(valor);
        teclado.close();
    }
}
