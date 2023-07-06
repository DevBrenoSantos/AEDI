import java.util.Scanner;
public class C14ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - conversão de graus");
        System.out.println("2 - Agencia bancária");
        System.out.println("3 - Média ponderada");
        System.out.println("4 - Poluentes");
        System.out.println("5 - Volume");
        System.out.println("9 - Sair");
        System.out.print(">>> ");
        opcao = teclado.nextInt();
        switch (opcao) {
            case 1: 
                String medida=""; 
                double graus, conversao;
                System.out.println("Insira a temperatura em Celsius: ");
                graus = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Para qual medida será convertida(kelvin ou Fahrenheit)?");
                medida = teclado.nextLine();
                    if (medida.equalsIgnoreCase("kelvin")) {
                        conversao = Graus.graus(graus, medida);
                        System.out.println("A temperatura em kelvin: "+conversao);
                }
                    else {
                        conversao = Graus.graus(graus, medida);
                        System.out.println("Temperatura em Fahrenheit: "+conversao);
                }
            break;
            case 2: 
                String pedido;
                int cheque, retorno;
                teclado.nextLine();
                System.out.println("Insira a operação desejada(Consultar agencia, banco ou sequencial): ");
                pedido = teclado.nextLine();
                System.out.println("Insira o número do cheque: ");
                cheque = teclado.nextInt();
                retorno = Financeiro.instituicao(cheque, pedido);
                    if (pedido.equalsIgnoreCase("banco")) {
                        System.out.println("Banco: "+retorno);
                    }
                    if (pedido.equalsIgnoreCase("agencia")) {
                        System.out.println("Agência: "+retorno);
                    }
                    if (pedido.equalsIgnoreCase("sequencial")) {
                        System.out.println("Sequencial: "+retorno);
                    }
            break;
            case 3:
                double n1, n2, n3, notaFinal;
                System.out.println("Insira a primeira nota: ");
                n1 = teclado.nextDouble();
                System.out.println("Insira a segunda nota: ");
                n2 = teclado.nextDouble();
                System.out.println("Insira a terceira nota");
                n3 = teclado.nextDouble();
                notaFinal = MediaPonderada.média(n1, n2, n3);
                System.out.println("Média ponderada: "+notaFinal);
            break;
            case 4: 
                int poluente;
                double multa;
                System.out.print("Informe o valor do Poluente Emitido: ");
                poluente = teclado.nextInt();
                multa = Poluentes.poluicao(poluente);
                System.out.println("Valor da multa: R$"+multa);
            break;
            case 5: 
                double raio, resultado;
                String calculo;
                System.out.println("Insira o valor do Raio: ");
                raio = teclado.nextDouble();
                teclado.nextLine();
                System.out.println("Deseja calcular o volume ou a área? ");
                calculo = teclado.nextLine();
                    if (calculo.equalsIgnoreCase("volume")) {
                        resultado = Volume.calculoV(raio);
                        System.out.println("Volume: "+resultado);
                    }
                    else {
                        resultado = Volume.calculoA(raio);
                        System.out.println("Área: "+resultado);
                    }
            break;
            case 9: break;
            default: System.out.println("Opção inválida"); break;
            }
        teclado.close();    
        }
    }

