import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class c12ex27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> endereço = new ArrayList<String>();
        List<String> CPFs = new ArrayList<String>();
        String pesquisa, alt, endNovo, incl, cpf="";
        do {
            System.out.print("Insira o CPF: ");
                cpf = teclado.nextLine();
                if (!cpf.equalsIgnoreCase("0")) {
                    CPFs.add(cpf);
                    System.out.print("Informe o endereço: ");
                    String end = teclado.nextLine();
                    endereço.add(end);
                }
            } while (!cpf.equalsIgnoreCase("0"));
        System.out.println("Informe um cpf a pesquisar: ");
        pesquisa = teclado.nextLine();
        int pos = CPFs.indexOf(pesquisa);
        if (pos >= 0) {
            System.out.println("CPF encontrado, deseja alterar o endereço ou excluir ambos(A/E)? ");
            alt = teclado.nextLine();
                if (alt.equalsIgnoreCase("A")) {
                    System.out.println("Qual o nomo endereço? ");
                    endNovo = teclado.nextLine();
                    endereço.set(pos, endNovo);
                }
                else {
                    endereço.remove(pos);
                    CPFs.remove(pos);
                }
        }
        else {
            System.out.println("CPF não encontrado, deseja inclui-lo(S/N)? ");
            incl = teclado.nextLine();
            if (incl.equalsIgnoreCase("S")) {
                CPFs.add(cpf);
                System.out.println("Qual endereço para este endereço?");
                endNovo = teclado.nextLine();
                endereço.add(endNovo);
            }
        }
        for (int aux=0; aux<CPFs.size(); aux++) {
            System.out.println("CPF: "+CPFs.get(aux));
            System.out.println("Endereço: "+endereço.get(aux));
        }

teclado.close();
    }
}
