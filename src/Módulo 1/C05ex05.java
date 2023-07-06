import java.util.Scanner;
public class C05ex05 {
    public static void main(String[] args) {
        int gc, gk, gf;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celsius: ");
        gc = teclado.nextInt();
        gf = (gc * 9) /5 + 32;
        gk = gc + 273;
        System.out.println("Em Fahrenheit corresponde a: "+gf);
        System.out.println("Em Kelvin Corresponde a: "+gk);
        teclado.close();
    }

}


