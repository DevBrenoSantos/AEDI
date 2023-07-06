import java.util.Scanner;
public class C08ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Insira um número");
        numero = teclado.nextInt();
        for (int aux=1; aux<=9; aux++) {
            resultado = numero * aux;
            System.out.println(aux+" x "+numero+" = "+resultado);
        }
    teclado.close();
    }
}
