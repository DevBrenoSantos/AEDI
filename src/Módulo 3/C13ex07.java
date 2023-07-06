import java.util.Scanner;
public class C13ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeCompleto, ultimoSobrenome;
        System.out.print("Insira o nome completo: ");
        nomeCompleto = teclado.nextLine();
        String[] nomes = nomeCompleto.split(" ");
        if (nomes.length > 1) {
            ultimoSobrenome = nomes[nomes.length -1];
            System.out.println("Nome da familia: "+ultimoSobrenome);
        }
        else {
            System.out.println("Não foi possível identificar o nome da familia.");
        }
    teclado.close();
    }
}
