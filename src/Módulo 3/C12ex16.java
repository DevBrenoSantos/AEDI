import java.util.Scanner;
public class C12ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[10];
        float mult[] = new float[10];
        float real;
        for (int aux=0; aux<num.length; aux++) {
            System.out.print("Insira um número: ");
            num[aux] = teclado.nextInt();
        }
        System.out.print("Insira um número real: ");
        real = teclado.nextFloat();
        for (int aux=0; aux<num.length; aux++) {
            mult[aux] = num[aux] * real;
        }
        for (int aux=0; aux<num.length; aux++) {
            System.out.println(mult[aux]);
        }
    teclado.close();
    }
}
