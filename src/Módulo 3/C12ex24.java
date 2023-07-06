import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class C12ex24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
        List<Integer> copia = new ArrayList<Integer>();
        for (int aux=0; aux<vet.length; aux++) {
            System.out.print("Informe um número: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<vet.length; aux++) {
            if (vet[aux]%3==0) {
                copia.add(vet[aux]);
            }
        }

        for (int aux=0; aux<copia.size(); aux++) {
            System.out.println(copia.get(aux));
        }

    teclado.close();
    }
}
