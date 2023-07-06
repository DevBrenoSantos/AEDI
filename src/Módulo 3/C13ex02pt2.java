import java.util.Scanner;
public class C13ex02pt2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;
        do {
            System.out.println("Informe o valor de x: ");
            x = teclado.nextDouble();
            if (x == -1)
                break;
            fx = C13ex02.funcao(x);
            System.out.println("F(x) = "+fx);
        } while (x != -1);
    teclado.close();
    }
}
