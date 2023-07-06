import java.util.Scanner;
public class C12ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pop[] = new int[15];
        int temppop;
        String tempnome, tempestado;
        String nome[] = new String[15]; 
        String estado[] = new String[15];
        for (int aux=0; aux<pop.length; aux++) {
            System.out.print("Insira o estado: ");
            estado[aux] = teclado.nextLine();
            System.out.print("Insira a cidade: ");
            nome[aux] = teclado.nextLine();
            System.out.print("Insira a população: ");
            pop[aux] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int aux=0; aux<pop.length-1; aux++) {
            for (int x=0; x<pop.length-1; x++) {
                if (pop[x] > pop[aux+1]) {
                    tempnome = nome[x];
                    nome[x] = nome[x+1];
                    nome[x+1] = tempnome;
                    temppop = pop[x];
                    pop[x] = pop[x+1];
                    pop[x+1] = temppop;
                    tempestado = estado[x];
                    estado[x] = estado[x+1];
                    estado[x+1] = tempestado; 
                }
            }
        }
        for (int aux=0; aux<10;aux++) {
            System.out.println(nome[aux]);
            System.out.println(estado[aux]);
        }
    teclado.close();
    }
}
