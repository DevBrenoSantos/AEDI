import java.util.Scanner;

public class C06ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double EQ1, EQ2;
        System.out.print("Insira a equipe 1: ");
        EQ1 = teclado.nextDouble();
        System.out.print("Insira a equipe 2: ");
        EQ2 = teclado.nextDouble();
        System.out.print("Insira os sets ganhos da equipe "+EQ1);

        System.out.print("Insira os set ganhos da equipe "+EQ2);
    
    teclado.close();
    }

}
