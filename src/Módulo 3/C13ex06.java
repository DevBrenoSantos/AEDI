import java.util.Scanner;
public class C13ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, familia;
        int cont=0;
        System.out.print("Insira o nome da familia: ");
        familia = teclado.nextLine();
        for (int aux=1; aux<=3; aux++) {
            System.out.print("Insira o nome completo: ");
            nome = teclado.nextLine();
            if (nome.endsWith(familia)) {
            cont++;
            }
        }
        System.out.println(cont+" pessoas participam dessa familia.");
    teclado.close();
    }   
}
