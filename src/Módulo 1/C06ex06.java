import java.util.Scanner;
public class C06ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, d, r1, r2;
        System.out.print("Insira o 'A' da sua função: ");
        a = teclado.nextDouble();
        System.out.print("Insira o 'B' da sua função: ");
        b = teclado.nextDouble();
        System.out.print("Insira o 'C' da sua função: ");
        c = teclado.nextDouble();

        d = Math.pow(b, 2) -4 * a * c;
            if (d > 0) {
                System.out.println("Possui 2 raízes reais");
                    r1 = (-b + d) /(2 * a);
                    r2 = (-b - d) /(2 * a);
                System.out.println("Teremos 2 raízes = "+r1+ " e "+r2);
            }
            if (d == 0) {
                System.out.println("Possui 1 raiz");
                    r1 = (-b + d) /(2 * a);
                System.out.println("Teremos 1 raiz = "+r1);
            }
            if (d < 0) {
                System.out.println("Não possui raízes reais");
            }
teclado.close();
    }
    
}
