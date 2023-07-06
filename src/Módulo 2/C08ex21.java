import java.util.Scanner;
public class C08ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, imc;
        System.out.print("Insira sua altura: ");
        altura = teclado.nextFloat(); 
            for (int aux=60; aux<=100; aux++) {
                imc = aux/Math.pow(altura, 2);
                if (imc < 20) {
                System.out.println("Peso = "+aux);
                    System.out.println("IMC = "+imc);
                    System.out.println("Abaixo do peso");
                }
                if (imc >= 20 && imc <= 25) {
                System.out.println("Peso = "+aux);
                    System.out.println("IMC = "+imc);
                    System.out.println("Peso ideal");
                }    
                if (imc > 25) {
                System.out.println("Peso = "+aux);
                    System.out.println("IMC = "+imc);
                    System.out.println("Acima do peso");
                }
            }
        teclado.close();    
    }
}
