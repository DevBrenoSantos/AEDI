import java.util.Scanner;
public class c05ex08 {
    public static void main(String[] args) {
        double a, s, r, pi, raio, s2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a area do setor circular: ");
        s = teclado.nextDouble();
        System.out.print("Insira o ângulo: ");
        a = teclado.nextDouble();
        pi = 3.1416;
        r = (a * pi) /360;
        s2 = s /r;
        raio = Math.sqrt(s2);
        System.out.println(raio);
        teclado.close();
    }
}
