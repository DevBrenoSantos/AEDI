package C14ex02;
import java.util.Scanner;
public class C14ex2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Selecione a opção para calcular a área: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo retângulo");
        System.out.println("4 - Círculo");
        System.out.println("9 - Sair");
        System.out.print(">>> ");
        opcao = console.nextInt();

        double lado, altura, raio, base, resultado;

        switch (opcao) {
            case 1:
                System.out.println("Insira o valor do lado do quadrado: ");
                lado = console.nextDouble();
                resultado = calculos.quadrado(lado);
                System.out.println("Área do quadrado = "+resultado);
            break;
            case 2:
                System.out.println("Insira o valor do lado do retângulo: ");
                lado = console.nextDouble();
                System.out.println("Insira o valor da altura do retângulo: ");
                altura = console.nextDouble();
                resultado = calculos.retangulo(lado, altura);
                System.out.println("Área do retângulo = "+resultado);
            break;
            case 3:
                System.out.println("Insira a base do triângulo: ");
                base = console.nextDouble();
                System.out.println("Insira a altura do triângulo: ");
                altura = console.nextDouble();
                resultado = calculos.triangulo(base, altura);
                System.out.println("Área do triângulo = "+resultado);
            break;
            case 4:
                System.out.println("Insira o valor do raio do círculo: ");
                raio = console.nextDouble();
                resultado = calculos.circulo(raio);
                System.out.println("Área do círculo = "+resultado);
            break;
            case 9: break;
            default: System.out.println("Opção inválida."); break;
        }
    console.close();
    }

}
