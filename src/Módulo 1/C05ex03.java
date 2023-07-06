import java.util.Scanner;
public class C05ex03 {
    public static void main(String[] args) {
        double salario, liquido, imposto, dependentes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira seu salário: ");
        salario = teclado.nextDouble();
        System.out.print("Insira o número de dependentes: ");
        dependentes = teclado.nextDouble();
        liquido = salario - (dependentes * 60);
        imposto = liquido * 0.15;
        System.out.print(imposto);
        teclado.close();
    }
}
