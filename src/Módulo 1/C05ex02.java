import java.util.Scanner;
public class C05ex02 {
    public static void main(String[] args) {
        double pi, area, raio, volume;
        pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor do Raio: ");
        raio = teclado.nextDouble();
        area = 4 * pi * (Math.pow(raio,2));
        volume = ((4 / 3) * pi) * (Math.pow(raio,3));
        System.out.println("Área: "+ area + "Volume: "+volume);
        teclado.close();
    }
}
