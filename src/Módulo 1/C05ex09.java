import java.util.Scanner;
public class C05ex09 {
    public static void main(String[] args) {
        double n1, n2, n3, sn, rf;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        n1 = teclado.nextDouble();
        System.out.print("Insira a segunda nota: ");
        n2 = teclado.nextDouble();
        System.out.print("Insira a terceira nota: ");
        n3 = teclado.nextDouble();
        sn = (n1 * 2) + (n2 * 3) + (n3 * 5);
        rf = sn /10;
        System.out.print("A média ficou em: "+rf);
        teclado.close();
    }
}
