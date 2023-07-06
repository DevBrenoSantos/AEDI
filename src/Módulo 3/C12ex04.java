import java.util.Scanner;
public class C12ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[20], cont=1;
        for (int aux=0;aux<vet.length;aux++) {
            System.out.print("Informe o número do corredor: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux=0;aux<=9;aux++) {
            System.out.println("Dupla "+cont);
            System.out.println(vet[aux]+" + "+vet[aux+10]);
            cont++;
        }
    teclado.close();
    }
}