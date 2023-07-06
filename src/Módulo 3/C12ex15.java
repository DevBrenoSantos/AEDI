import java.util.Scanner;
public class C12ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[10];
        int media, soma=0, cont=0;
        for (int aux=0; aux<num.length; aux++) {
            System.out.print("Insira um número inteiro: ");
            num[aux] = teclado.nextInt();
        }
        for (int aux=0; aux<num.length; aux++) {
            if (num[aux]%2 == 0) {
                System.out.println(num[aux]);
                soma += num[aux];
                cont++;
            }
        }
        media = soma/cont;
        System.out.println("Média = "+media);
    teclado.close();
    }
}
