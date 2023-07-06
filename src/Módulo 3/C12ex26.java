import java.util.Scanner;
public class C12ex26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.print("Insira uma frase: ");
        frase = teclado.nextLine();
        String palavras[] = frase.split(" ");
        for (int aux=0; aux<palavras.length; aux++) {
            System.out.println(palavras[aux]);
        }
    
    teclado.close();
    }
}
