import java.util.Scanner;
public class C04ex02 {
    public static void main(String[] args) {
        String nome, nomeE;
        int cpf, id, titE, cnh, salario;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome completo: ");
        nome = teclado.nextLine();
        System.out.print("Informe o nome da empresa: ");
        nomeE = teclado.nextLine();
        System.out.print("Informe o seu CPF: ");
        cpf = teclado.nextInt();
        System.out.print("Informe sua identidade: ");
        id = teclado.nextInt();
        System.out.println("Informe o número do seu título de eleitor: ");
        titE = teclado.nextInt();
        System.out.print("Informe o número da sua CNH: ");
        cnh = teclado.nextInt();
        System.out.print("Informe seu salário: ");
        salario = teclado.nextInt();
        System.out.println("Ficha funcional de: "+nome);
        System.out.println("Documentos:");
        System.out.println("CPF: "+cpf);
        System.out.println("C.I. "+id);
        System.out.println("Titulo de Eleitor: "+titE);
        System.out.println("Carteira de motorista: "+cnh);
        System.out.println("Empresa: "+nomeE);
        System.out.println("Salario: R$"+salario);
        teclado.close();

    }
}
