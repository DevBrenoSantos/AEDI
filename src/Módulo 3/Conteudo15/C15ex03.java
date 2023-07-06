
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class C15ex03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeInst, endereco;
        List<C15ex02> dinamicList = new ArrayList<C15ex02>();
        do {
            System.out.println("Insira o nome da instituição(X para encerrar): ");
            nomeInst = console.nextLine();
            if (nomeInst.equalsIgnoreCase("x")) {
                break;
            }
            System.out.println("Insira o endereço: ");
            endereco = console.nextLine();
            dinamicList.add(new C15ex02(nomeInst, endereco));
        } while (true);
        for (C15ex02 P : dinamicList) {
            System.out.println("--------------------");
            P.imprimeInstituicao();
            System.out.println("--------------------");
        }
    console.close();
    }
}
