import java.util.Scanner;
public class C09ex03 {
    public static void main(String[] args) {
        double num, den, serie=0, rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade de termos: ");
        rep = teclado.nextDouble();
            for (int aux=1; aux<=rep; aux++) {
                num = 1 + (Math.sqrt(aux*4));
                den = aux * 3;
                serie += num/den;
            }
        System.out.println("Valor da serie = "+serie);
        teclado.close();
    }
}
