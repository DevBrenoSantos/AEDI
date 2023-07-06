import java.util.Scanner;
public class C06ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float poluente, vam;
        System.out.print("Poluentes emitidos: ");
        poluente = teclado.nextFloat();
            if (poluente <= 1500)
                System.out.print("Isento");
            if (poluente > 1500 && poluente <= 3500)
                System.out.print("Multa no valor de R$3.000,00");
            if (poluente > 3500) {
                vam = 5000 * poluente;
                System.out.print("Multa no valor de R$"+vam);
            }
teclado.close();
    }
}

