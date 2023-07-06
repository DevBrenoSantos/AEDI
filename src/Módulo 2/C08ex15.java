import java.util.Scanner;
public class C08ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, cargo, funçao = "", nomemaior = "";
        cargo = "";
        float salario, idade, soma = 0, salariomaior = 0, cont1 = 0, média;
        for (int aux=1; aux<=5; aux++) {
            System.out.println("Nome: ");
            nome = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Cargo: ");
            cargo = teclado.nextLine();
            System.out.println("Salário: ");
            salario = teclado.nextFloat();
            System.out.println("Idade: ");
            idade = teclado.nextFloat();
                if (salario > 10000 && idade > 50) {
                funçao.equalsIgnoreCase("Sênior");
                    System.out.println("Funcionario Sênior.");
                }
                if (idade <= 18) {
                    soma += salario;
                    cont1++;
                }
                if (aux == 1 || salario > salariomaior) {
                    salariomaior = salario;
                    nomemaior = nome;
                }
        }
        média = soma/cont1;
        System.out.println("Média dos funcionários até 18 anos: "+média);
        System.out.println("Funcionário com maior salário: "+nomemaior+" "+salariomaior);
        System.out.println(cargo);
        teclado.close();
    }
}
