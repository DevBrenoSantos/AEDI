import java.util.Scanner;
public class C08ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String insumo, insumomaior = "";
        int quantidade, rep;
        double precounit, custoparcial = 0, precomaior = 0, soma = 0, media;
        System.out.println("Número de insumos: ");
        rep = teclado.nextInt();
            for (int aux=1; aux<=rep; aux++) {
                System.out.print("Informe o nome do insumo: ");
                insumo = teclado.nextLine();
                teclado.nextLine();
                System.out.print("informe a quantidade do insumo: ");
                quantidade = teclado.nextInt();
                System.out.print("Informe o preço unitário: ");
                precounit = teclado.nextDouble();
                if (aux == 1 || precounit > precomaior) {
                    precomaior = precounit;
                    insumomaior = insumo;
                }
                teclado.nextLine();
                custoparcial = quantidade * precounit;
                soma += custoparcial;
                System.out.println("Custo Parcial: " + custoparcial);
            }
            media = soma/rep;
        System.out.println("Custo Total: "+soma);
        System.out.println("Média dos custos: "+media);
        System.out.println("Nome do insumo de maior custo: "+insumomaior);
        teclado.close();
    }
}
