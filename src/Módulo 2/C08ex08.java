import java.util.Scanner;
public class C08ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int faltas, nota, soma = 0, media = 0, cont = 0, cont1 = 0;
        for (int aux=1; aux<=50; aux++) {
            System.out.println("Nota final: ");
            nota = teclado.nextInt();
            System.out.println("Total de faltas: ");
            faltas = teclado.nextInt();
                if (nota > 65 && faltas < 16) {
                System.out.println("Nota = "+nota+" Faltas = "+faltas);
                System.out.println("Aluno Aprovado!");
                soma += nota;
                cont++;
                }
                else {
                    System.out.println("Nota = "+nota+"Faltas = "+faltas);
                    System.out.println("Aluno Reprovado!");
                }
                if (faltas > 16) {
                    cont1++;
                }
        }
    media = soma/cont;
    System.out.println("Média das notas dos aprovados = "+media);
    System.out.println("Quantidade de alunos com mais de 16 faltas = "+cont1);    
    teclado.close();
    }
}
