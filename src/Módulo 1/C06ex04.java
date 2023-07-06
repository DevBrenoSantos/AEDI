import java.util.Scanner;
public class C06ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            String nome;
            double peso, altura, imc;
        
        System.out.print("Nome completo: ");
        nome = teclado.nextLine(); 
        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextDouble();
        System.out.print("Informe seu peso em KG: ");
        peso = teclado.nextDouble();

        imc = peso /Math.pow(altura, 2);
            
            if (imc < 18) {
                System.out.println(nome+" está desnutrida");
                System.out.println("IMC= "+imc);
            }
            if (imc >= 18 && imc < 20) {
                System.out.println(nome+" está abaixo do peso");
                System.out.println("IMC= "+imc);
            }
            if (imc >= 20 && imc < 25) {
                System.out.println(nome+" está no peso ideal");
                System.out.println("IMC= "+imc);
            }               
            if (imc > 25 && imc < 27) {
                System.out.println(nome+" está acima do peso");
                System.out.println("IMC= "+imc);
            }
            if (imc > 27) {
                System.out.println(nome+" está obesa");
                System.out.println("IMC= "+imc);
            }
    teclado.close();
        }
}
