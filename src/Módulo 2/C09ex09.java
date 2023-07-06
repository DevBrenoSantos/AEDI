import java.util.Scanner;
public class C09ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, den, serie=0, termos, var=10, var2=0;
        System.out.print("Insira a quantidade de termos: ");
        termos = teclado.nextDouble();
            for (int aux=1; aux<=termos; aux++) {
                num = Math.pow(9, aux);
                den = var*Math.sqrt(Math.pow(aux, var2));
                var += 1;
                var2 = 4;
                serie += num/den;
            }
        serie = 100 - Math.pow(serie, 3);
        System.out.println(serie);
        teclado.close();
    }
}
