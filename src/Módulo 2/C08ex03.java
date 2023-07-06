import java.util.Scanner;
public class C08ex03 {
    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0;
        double nota, falta;
        Scanner teclado = new Scanner(System.in);
        for (int aux=1; aux<=50; aux++) {
            System.out.print("Insira a nota Final: ");
            nota = teclado.nextDouble();
            if (nota == -1)
                break;
            System.out.print("Insira o número de faltas: ");
            falta = teclado.nextDouble();
            if (nota >= 65 && falta < 16) {
                System.out.println("Nota = "+nota+" Faltas = "+falta+" Aluno Aprovado");
                cont1++;
            }
            else {
                System.out.println("Nota = " + nota + " Faltas = " + falta + " Aluno Reprovado");
                cont2++;
            }
        }
        System.out.println("Aprovados: "+cont1);
        System.out.println("Repovados: "+cont2);
        teclado.close();
    }
}
