import java.util.Scanner;
public class C13ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, nomeM; 
        System.out.print("Insira teu nome completo: ");
        nome = teclado.nextLine();
        nomeM = nome.toUpperCase();
        String[] vertical = nomeM.split("");
        for (int aux=0; aux<vertical.length; aux++) {
            System.out.println(vertical[aux]);
        }
    teclado.close();
    }
}
