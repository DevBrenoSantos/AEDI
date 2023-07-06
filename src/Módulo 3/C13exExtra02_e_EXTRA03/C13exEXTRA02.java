package C13exExtra02_e_EXTRA03;
import java.util.Scanner;
public class C13exEXTRA02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double salario, dependentes, IRPF;
        System.out.print("Insira o salário: ");
        salario = console.nextDouble();
        System.out.print("Insira a quatidade de dependentes: ");
        dependentes = console.nextDouble();
        IRPF = CalculoImposto.IRPF(salario, dependentes);
        System.out.println("Salário: R$"+salario);
        System.out.println("Número de dependentes: "+dependentes);
        if (IRPF != 0)    
            System.out.println("Imposto: "+IRPF);
        else 
            System.out.println("Imposto: Isento");
    console.close(); 
    }
}
