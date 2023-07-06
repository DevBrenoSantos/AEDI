import java.util.Scanner;
public class C13ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double graus, rad, sen, cos, tg, arcsen, arccos, arctg;
        System.out.print("Insira o ângulo em graus: ");
        graus = teclado.nextDouble();
        rad = Math.toRadians(graus);
        sen = Math.sin(rad);
        cos = Math.cos(rad);
        tg = Math.tan(rad);
        arcsen = 1/sen;
        arccos = 1/cos;
        arctg = cos/sen;
        System.out.println("Seno = "+sen);
        System.out.println("Cosseno = "+cos);
        System.out.println("Tangente = "+tg);
        System.out.println("Arco seno = "+arcsen);
        System.out.println("Arco consseno = "+arccos);
        System.out.println("Arco tangente = "+arctg);
    teclado.close();
    }    
}
