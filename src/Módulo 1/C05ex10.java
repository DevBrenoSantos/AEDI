import java.util.Scanner;
public class C05ex10 {
    public static void main(String[] args) {
        int np, d1, d2, d3, d4, d5;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número inteiro de 5 digitos: ");
        np = teclado.nextInt();
        d1 = np / 10000;
        d2 = np / 1000 % 10;
        d3 = np / 100 % 10;
        d4 = np / 10 % 10;
        d5 = np % 10;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        teclado.close();
    }
    
}

