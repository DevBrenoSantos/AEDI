import java.util.Scanner;
public class C12ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota[] = new int[8], notaMaior=0;
        String nome[] = new String[8], nomeMaior="";
        for (int aux=0; aux<nota.length; aux++) {
            System.out.print("Nome do aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.print("Nota: ");
            nota[aux] = teclado.nextInt();
            if (nota[aux] > notaMaior) {
                notaMaior = nota[aux];
                nomeMaior = nome[aux];
            }
        teclado.nextLine();
        }
        System.out.println(nomeMaior);
    teclado.close();
    }
}
