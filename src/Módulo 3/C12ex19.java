import java.util.Scanner;
public class C12ex19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int bilhete[] = new int[10];
    int premiado, pos = -1;
    for (int aux=0; aux<bilhete.length; aux++) {
        System.out.print("Insira o número do bilhete: ");
        bilhete[aux] = teclado.nextInt();
    }
    System.out.println("insira o bilhete premiado: ");
    premiado = teclado.nextInt();
    for (int aux=0; aux<bilhete.length; aux++) {
        if (premiado == bilhete[aux]) {
            pos = aux;
            break;
        }
    }
    if (pos == -1) {
        System.out.println("Bilhete premiado não encotrado. ");
    }
    else {
        System.out.println("Parabéns, o bilhete foi premiado! ");
    }

    teclado.close();
    }
}
