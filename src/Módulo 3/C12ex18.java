import java.util.Scanner;
public class C12ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fila[] = new String[10];
        String pesquisa;
        int pos = -1, cont=1;
        for (int aux=0; aux<fila.length; aux++) {
            System.out.print("Informe o próximo da fila: ");
            fila[aux] = teclado.nextLine();
        }
        System.out.print("Insira o nome a pesquisar na fila: ");
        pesquisa = teclado.nextLine();
        for (int aux=0; aux<fila.length; aux++) {
            if (pesquisa.equalsIgnoreCase(fila[aux])) {
            pos = aux;
            break;
            }
            cont++;
        }
        if (pos == -1)
            System.out.println("Nome não encontrado");
        else {
            System.out.println("Nome encontrado na posição "+cont);
        }
    teclado.close();
    }
}
