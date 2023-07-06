import java.util.Scanner;
public class C12ex23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String placa[] = new String[5];
        String nome[] = new String[5];
        int pos = -1;
        String pesquisa;
        for (int aux=0; aux<placa.length; aux++) {
            System.out.print("Informe a placa do carro: ");
            placa[aux] = teclado.nextLine();
            System.out.print("Informe o nome do dono do carro: ");
            nome[aux] = teclado.nextLine();
        }
        System.out.print("Informe a placa ou o nome do proprietário: ");
        pesquisa = teclado.nextLine();
        for (int aux=0; aux<placa.length; aux++) {
            if (pesquisa.equalsIgnoreCase(placa[aux])) {
                pos = aux;
                break;
            }
            if (pesquisa.equalsIgnoreCase(nome[aux])) {
                pos = aux;
                break;
            }
        }
        if (pos == -1) {
            System.out.print("Nome ou placa não encontrada");
        }
        else {
            System.out.println("Vaga número: "+pos);
        }
    teclado.close();
    }
}
