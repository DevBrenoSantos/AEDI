import java.util.Scanner;
public class C08ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade, cont1 = 0, cont2 = 0;
        for (int aux=1; aux <= 50; aux++) {
            System.out.println("Nome do aluno: ");
            nome = teclado.nextLine();
            System.out.println("Idade: ");
            idade = teclado.nextInt();
            if (idade == -1)
                break;
            if (idade <= 18)
                cont1++;
            if (idade > 18)
                cont2++;
            System.out.println("Nome: "+nome+" idade: "+idade);
            teclado.nextLine();
            teclado.close();
        }
        System.out.println("Até 18 = "+cont1);
        System.out.println("Acima de 18 = "+cont2);

    }
}
