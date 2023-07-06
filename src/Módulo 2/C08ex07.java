import java.util.Scanner;
public class C08ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        nome = "";
        double media = 0;
        int idade, cont1 = 0, cont2 = 0, cont3 = 0,soma = 0;
        for (int aux=1; aux<=5; aux++) {
            System.out.println("Nome do aluno: ");
            nome = teclado.nextLine();
            System.out.println("Idade do aluno: ");
            idade = teclado.nextInt();
            if (idade <= 12) {
                cont1++;
            }
            if (idade > 30) {
                cont2++;
            }
            cont3++;
            soma += idade;
            media = soma/cont3;
            teclado.nextLine();
        }
        System.out.println("Alunos que tem até 12 anos = "+cont1);
        System.out.println("Alunos que tem acima de 30 anos = "+cont2);
        System.out.println("Média das idades informadas = "+media);
        System.out.println(nome);
    teclado.close();
    }
    
}
