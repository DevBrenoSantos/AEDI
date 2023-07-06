package C13exExtra02_e_EXTRA03;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class C13exEXTRA03_main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double salario, dependentes;
        String nome;
        List<C13exEXTRA03> funs = new ArrayList<C13exEXTRA03>();
        do {
            System.out.println("Insira o nome do funcionário(X para encerrar): ");
            nome = console.nextLine();
                if (nome.equalsIgnoreCase("x"))
                    break;
            System.out.print("Insira o salário: ");
            salario = console.nextDouble();
            System.out.print("Insira a quatidade de dependentes: ");
            dependentes = console.nextDouble();
            funs.add(new C13exEXTRA03(nome, salario, dependentes));
            console.nextLine();
        } while (true);
        for (C13exEXTRA03 P: funs) {
            System.out.println("----------------------------");
            P.imprimeFuncionario();
            System.out.println("----------------------------");
        }
    console.close();
    }
}
