import java.util.Scanner;
public class C06ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int var, v1, v2;
        System.out.print("Verificação de divisão: ");
        var = teclado.nextInt();
        v1 = var % 5;
        v2 = var % 7;
            if (v1 == 0 && v2 == 0) {
                System.out.println(var+" é divisível simultaneamente por 5 e 7");
            }
            else {
                System.out.println(var+" não é divisível simultaneamente por 5 e 7");
            }
        teclado.close();
    }
    
}
