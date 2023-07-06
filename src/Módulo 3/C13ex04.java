import java.util.Scanner;
public class C13ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double var, tentativa;
        int cont=0;
        var = Math.round(Math.random() * 100);
        do {
            System.out.print("Tente adivinhar o número: ");
            tentativa = teclado.nextDouble();
            cont++;
            if (tentativa != var) {
                System.out.println("Número incorreto, tente novamente.");
                if (tentativa > var) {
                    System.out.println("O número informado está acima do resultado.");
                }
                if (tentativa < var) {
                    System.out.println("O número informado está abaixo do resultado.");
                }
            }
        } while (tentativa != var);
        System.out.println("Parabéns! Você acertou. Foram nescessárias "+cont+" repetições");
    teclado.close();
    }
}
