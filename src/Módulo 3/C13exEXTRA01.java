import java.util.Scanner;
public class C13exEXTRA01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double salario, dependentes, IRPF, var;
        System.out.print("Insira o salário: ");
        salario = console.nextDouble();
        System.out.print("Insira a quatidade de dependentes: ");
        dependentes = console.nextDouble();
        var = salario - (dependentes * 150);
            if (var <= 1000) {
                System.out.println("Salário: R$"+salario);
                System.out.println("Número de dependentes: "+dependentes);
                System.out.println("Imposto: Isento");
            }
            if (var > 1000 && var <= 5000) {
                IRPF = var * 0.1;
                System.out.println("Salário: R$"+salario);
                System.out.println("Número de dependentes: "+dependentes);
                System.out.println("Imposto: "+IRPF);
            }
            if (var > 5000 && var <= 10000) {
                IRPF = var * 0.15;
                System.out.println("Salário: R$"+salario);
                System.out.println("Número de dependentes: "+dependentes);
                System.out.println("Imposto: "+IRPF);
            }
            if (var > 10000) {
                IRPF = var * 0.2;
                System.out.println("Salário: R$"+salario);
                System.out.println("Número de dependentes: "+dependentes);
                System.out.println("Imposto: "+IRPF);
            }

    console.close(); 
    }
}
