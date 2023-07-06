import java.util.Scanner;
public class C05ex07 {
    public static void main(String[] args) {
        double x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de X: ");
        x = teclado.nextDouble();
        y = Math.sqrt(Math.pow( x/4.0 + 1 ,2)+1/5.0*x);
        System.out.print(y);
        teclado.close();
    }
    
}
