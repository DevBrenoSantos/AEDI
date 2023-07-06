package C15ex01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome, ra, curso, pesquisa;
        int anoNasc, periodo;
        List<Aluno> Alunos = new ArrayList<Aluno>();
        do {
            System.out.println("Informe o nome do aluno(X para encerrar): ");
            nome = console.nextLine();
            if (nome.equalsIgnoreCase("x"))
                break;
            System.out.println("Informe o Registro acadêmico: ");
            ra = console.nextLine();
            System.out.println("Insira o curso: ");
            curso = console.nextLine();
            System.out.println("Informe o periodo: ");
            periodo = console.nextInt();
            System.out.println("Informe o ano de nascimento: ");
            anoNasc = console.nextInt();
            Alunos.add(new Aluno(nome, ra, curso, anoNasc, periodo));
            console.nextLine();
        } while (true);
        System.out.println("Informe um nome para pesquisar: ");
        pesquisa = console.nextLine();
        int pos = -1;
        boolean achou = false;
        for (Aluno P : Alunos) {
            pos++;
            if (P.getNome().toUpperCase().contains(pesquisa.toUpperCase())) {
                System.out.println("-----------------------------------------");
                System.out.println(">>> Pessoa encontrada");
                P.ImprimeAluno();
                System.out.println("-----------------------------------------");
                achou = true;
                break;
            }
        }
        if (!achou) 
            System.out.println("Pessoa não encontrada.");
        else {
            System.out.println("Quer removê-la da lista (S/N)?");
            String resp = console.nextLine();
            if (resp.equalsIgnoreCase("S")) {
                Alunos.remove(pos);
            }
        }
    console.close();
    }
}
