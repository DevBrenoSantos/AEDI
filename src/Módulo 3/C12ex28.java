import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class C12ex28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomevar, temp, registrovar, temp1="", pesquisa;
        List<String> nome = new ArrayList<String>();
        List<String> registro = new ArrayList<String>();
        int pos = -1;
        for (int aux=0; aux<5; aux++) {
            System.out.print("Insira o nome do aluno: ");
            nomevar = teclado.nextLine();
            nome.add(nomevar);
            System.out.print("Insira o registro acadêmico: ");
            registrovar = teclado.nextLine();
            registro.add(registrovar);
        }
        for (int aux=0; aux<nome.size(); aux++) {
            for (int x=0; aux<nome.size(); aux++) {
                if (nome.get(x).compareToIgnoreCase(nome.get(x+1)) > 0) {
                    temp = nome.get(x);
                    nome.set(x, nome.get(x+1));
                    nome.set(x+1, temp);
                    temp1 = registro.get(x);
                    registro.set(x, registro.get(x+1));
                    nome.set(x+1, temp);
                }
            }
        }
        System.out.println("Insira um nome a pesquisar: ");
        pesquisa = teclado.nextLine();
        pos = nome.indexOf(pesquisa);
        if (pos >= 0) {
            System.out.println("Registro acadêmico: "+registro.get(pos)+" Posição: "+pos+1);
        }
        System.out.println(temp1);
    teclado.close();
    }
}
