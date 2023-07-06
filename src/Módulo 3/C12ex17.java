import java.util.Scanner;
public class C12ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
        int vet1[] = new int[10];
        int cont=9;
        for (int aux=0; aux<vet.length; aux++) {
            System.out.print("Insira um número: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<vet.length; aux++) {
            vet1[cont] = vet[aux];
            cont--;
        }
        for (int aux=0; aux<vet.length; aux++) {
            System.out.println(vet1[aux]);
        }
    teclado.close();
    }
}
