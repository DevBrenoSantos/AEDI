import java.util.Scanner;
public class C12ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[20];
        for (int aux=0; aux<num.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            num[aux] = teclado.nextInt();   
        }
        for (int aux=0; aux<num.length; aux+=2) {
            System.out.print(num[aux]+" ");
        }
        for (int aux=1; aux<num.length; aux+=2) {
            System.out.print(num[aux]+" ");
        }
    teclado.close();
    }
}
