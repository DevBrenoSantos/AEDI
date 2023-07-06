import java.util.Scanner;
public class C05ex04 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, z1, z2, resultado;  
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o x1: ");
        x1 = teclado.nextDouble();
        System.out.print("Insira o y1: ");
        y1 = teclado.nextDouble();
        System.out.print("Insira o x2: ");
        x2 = teclado.nextDouble();
        System.out.print("Insira o y2: ");
        y2 = teclado.nextDouble();
        z1 = x1 - x2;
        z2 = y1 - y2;
        resultado = Math.sqrt((Math.pow(z1,2)) + (Math.pow(z2,2)));
        System.out.println(resultado);
        teclado.close();
    }
    
}