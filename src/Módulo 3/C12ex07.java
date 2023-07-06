import java.util.Scanner;
public class C12ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[5];
        String vet1[] = new String[5];
            for (int aux=0; aux<vet.length; aux++) {
                System.out.print("Insira o nome do aluno: ");
                vet1[aux] = teclado.nextLine();
                System.out.print("Insira a nota do aluno: ");
                vet[aux] = teclado.nextInt();
                teclado.nextLine();
            }
            for (int aux=0; aux<vet.length; aux++) {
                System.out.println("Nome do aluno: "+vet1[aux]);
                    if (vet[aux] <= 30) {
                        System.out.println("Conceito: D");
                    }
                    if (vet[aux] >= 31 && vet[aux] <= 60) {
                        System.out.println("Conceito: C");
                    }
                    if (vet[aux] >= 61 && vet[aux] <= 80) {
                        System.out.println("conceito: B");
                    }
                    if (vet[aux] > 80) {
                        System.out.println("Conceito: A");
                    }
            }
    teclado.close();
    }
}
