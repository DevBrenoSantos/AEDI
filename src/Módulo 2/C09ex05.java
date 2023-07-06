import java.util.Scanner;
public class C09ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, den, serie=0, termos, cont1=0, cont2=1;
        System.out.println("Insira a quantidade de termos: ");
        termos = teclado.nextDouble();
            for (int aux=1; aux<=termos; aux++) {
                cont1++;
                num = ((aux-1) * 2) + (aux* 3);
                den = (8 * cont1) - cont2;
                cont2+=2;
                serie += 5*(num/den);
            }

        System.out.println(serie);
        teclado.close();
    }
}
