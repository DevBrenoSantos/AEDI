import java.util.Scanner;
public class C06ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vendas, fixo, salario;
        fixo = 240.00;
        System.out.print("Valor mensal de vendas: ");
        vendas = teclado.nextDouble();
            if (vendas <= 1000) 
                System.out.print("Salário: R$"+fixo);
            if (vendas > 1000 && vendas <= 10000) {
                salario = (vendas * 0.1) + fixo;
                System.out.print("Salário: R$"+salario);
            }
            if (vendas > 10000) {
                salario = 1000 + fixo;
                System.out.print("Salário: R$"+salario);
            }
            teclado.close();
            } 
}
