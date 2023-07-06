import java.util.Scanner;
public class C12ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vet[] = new String[12];
            for (int aux=0; aux<vet.length; aux++) {
                System.out.print("Informe os meses do ano: ");
                vet[aux] = teclado.nextLine();
            }
            for (int aux=vet.length-1; aux>-1; aux--) {
                System.out.println("Meses: "+vet[aux]);
            }
    teclado.close();
    }
}
