import java.util.Scanner;
public class C08ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        String codigo;
            for (int aux=1; aux<=1000; aux++) {
                System.out.println("Codigo do produto: ");
                codigo = teclado.nextLine();
                    if (codigo.equalsIgnoreCase("1"))
                        soma += 1565;
                    if (codigo.equalsIgnoreCase("2"))
                        soma += 1890;
                    if (codigo.equalsIgnoreCase("3"))
                        soma += 2150;
                    if (codigo.equalsIgnoreCase("4"))
                        soma += 2963;
                    if (codigo.equalsIgnoreCase("5"))
                        soma += 3750;
        }
        System.out.println("Faturamento foi de: R$"+soma+",00");
        teclado.close();
    }
}
