import java.util.Scanner;
public class C12ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota[] = new int[8], soma=0, cont=0;
        double media;
        String nome[] = new String[8];
        for (int aux=0; aux<nota.length; aux++) {
            System.out.print("Insira o nome do aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.print("Insira a nota do aluno: ");
            nota[aux] = teclado.nextInt();
            soma += nota[aux];   
            cont++;
            teclado.nextLine();
        }
        media = soma/cont;
        for (int aux=0; aux<nota.length; aux++) {
            if (nota[aux] > media) {
                System.out.println(nome[aux]);
                System.out.println(nota[aux]);
            }
        }
    teclado.close();
    }
}
