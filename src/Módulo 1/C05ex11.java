import java.util.Scanner;
public class C05ex11 {
    public static void main(String[] args) {
        int cheque, banco, agencia, sequencial;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o número do cheque: ");
        cheque = teclado.nextInt();
        banco = cheque / 1000000;
        agencia = cheque / 1000 % 1000;
        sequencial = cheque % 1000;
        System.out.println("Banco: "+banco);
        System.out.println("Agência: "+agencia);
        System.out.println("Sequencial: "+sequencial);
        teclado.close();
    }
}
