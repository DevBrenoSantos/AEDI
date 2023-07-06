import java.util.Scanner;
public class C12ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[20];
        int soma=0;
        for (int aux=0; aux<vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<vet.length; aux++) {
            soma = vet[aux] + vet[aux+10];
            System.out.println("Soma = "+soma);
        }
    teclado.close();
    }
}
