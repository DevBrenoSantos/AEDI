import java.util.Scanner;
public class C12ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
        for (int aux=0; aux<vet.length;aux++) {
            System.out.print("informe um valor numérico: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<vet.length;aux++) {
            System.out.println(Math.pow(vet[aux], 2));
        }
    teclado.close();
    }
}
