import java.util.Scanner;
public class C08ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep;
        double soma = 0, soma1 = 0;
        System.out.print("Insira a quatidade de termos: ");
        rep = teclado.nextInt();
            for (int aux=0; aux<=rep; aux++) {
                soma = Math.pow(2, aux);
                soma1 += soma;
            }
        System.out.println("Soma dos "+rep+" primeiros termos: "+soma1);
    teclado.close();
    }
}
