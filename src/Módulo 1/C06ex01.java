import java.util.Scanner;
public class C06ex01 {
    public static void main(String[] args) {
        double x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de x: ");
        x = teclado.nextDouble();
            if (x < 4) {
            y = ((5 * x) + 3) /Math.sqrt(16-(Math.pow(x, 2)));
            System.out.print("F(x)= "+y);
        }
            if (x == 4) {
            y = 0;
            System.out.print("F(x)= "+y);
        }
            if (x > 4) {
            y = ((5 * x) + 3) /Math.sqrt((Math.pow(x,2) -16));
            System.out.print("F(x)= "+y);
            }
        teclado.close();
    }
    
}
