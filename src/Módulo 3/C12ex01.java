import java.util.Scanner;
public class C12ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10], cont1=0;
        for (int aux=0; aux<vet.length; aux++) {
            System.out.print("Insira um valor inteiro: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<vet.length; aux++) {
            if (vet[aux]%5 == 0 && vet[aux]%7 == 0) {
                cont1++;
            }
        }
        System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: "+cont1);
    teclado.close();
    }
}
