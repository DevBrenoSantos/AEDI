import java.util.Scanner;
public class C05ex06 {
    public static void main(String[] args) {
        double a, b, c, x, y, r, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de a: ");
        a = teclado.nextDouble();
        System.out.print("Insira o valor de b: ");
        b = teclado.nextDouble();
        System.out.print("Insira o valor de c: ");
        c = teclado.nextDouble();
        System.out.print("Insira a cordenada x do ponto P: ");
        x = teclado.nextDouble();
        System.out.print("Insira a cordenada y do ponto P: ");
        y = teclado.nextDouble();
        r = (a * x) + (b * y) + c;
        distancia = r /Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
        System.out.println(distancia);
        teclado.close();
    }
    
}
