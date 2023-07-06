import java.util.Scanner;
public class C04ex03 {
    public static void main(String[] args) {
        int poluente;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor do Poluente Emitido: ");
        poluente = teclado.nextInt();
        System.out.println("Poluente Emitido: "+poluente);
        System.out.println("Valor da multa: ");
        if (poluente <= 1500)
            System.out.println("Multa de R$1500,55");
        if (poluente > 1500 && poluente <= 3000)
            System.out.println("Multa de R$3550,34");
        if (poluente > 3000)
            System.out.println("Multa de 1200,21");
        teclado.close();
    }
}
