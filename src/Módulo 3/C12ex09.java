import java.util.Scanner;
public class C12ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10], soma=0;
            for (int aux=0; aux<vet.length; aux++) {
                System.out.print("Informe um valor inteiro: ");
                vet[aux] = teclado.nextInt();
                soma += vet[aux];
            }
            for (int aux=0; aux<vet.length; aux++) {
                if (soma%vet[aux]==0) {
                    System.out.println(vet[aux]);
                }
            }
    teclado.close();
    }

}
