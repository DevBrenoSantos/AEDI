import java.util.Scanner;
public class C06ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, F, M;
        System.out.print("Insira sua altura :");
        altura = teclado.nextFloat();
        M = 72.7 * altura - 58;
        F = 62.1 * altura - 44.7;
        System.out.println("Altura= "+altura+" Sexo= F Peso= "+F);
        System.out.println("Altura= "+altura+" Sexo= M Peso= "+M);
    teclado.close();
    }
}
