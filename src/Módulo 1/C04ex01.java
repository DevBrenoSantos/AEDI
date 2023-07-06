import java.util.Scanner;
public class C04ex01 {
    public static void main(String[] args) {
        String Pnome, Snome, Sbnome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe Seu primeiro nome: ");
        Pnome = teclado.nextLine();
        System.out.print("Informe seu sobrenome: ");
        Sbnome = teclado.nextLine();
        System.out.print("Informe seu nome do meio: ");
        Snome = teclado.nextLine();
        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();
        System.out.println(Sbnome +", "+Pnome +" "+ Snome);
        System.out.println("Idade: "+idade+" anos");
        teclado.close();
    }
}
