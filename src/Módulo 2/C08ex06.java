import java.util.Scanner;
public class C08ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        int valores, cont = 0;
        for (int aux=1; aux <= 10; aux++) {
        System.out.println("Insira um número inteiro: ");
        valores = teclado.nextInt();
        if (valores % 2 == 0) {
            System.out.println(valores+" é um número par");
        }
        else {
            System.out.println(valores+" é um número ímpar");
        }
        if (valores % 4 == 0) {
            soma += valores;
        }
        if (valores % 3 == 0) {
            cont++;
        }
        }
        System.out.println("Soma dos números divisíveis por 4: "+soma);
        System.out.println("Quantidade de números divisíveis por 3: "+cont);
    teclado.close();
    }
    
}
