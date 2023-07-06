import java.util.Arrays;
import java.util.Scanner;
public class C12ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        String meses[] = new String[12];
            for (int aux=0; aux<meses.length; aux++) {
                System.out.print("Insira um mês: ");
                meses[aux] = teclado.nextLine();
            }
            Arrays.sort(meses);
            for (int aux=0; aux<meses.length; aux++) {
                System.out.println(meses[aux]);
            }
    teclado.close();
    }
}