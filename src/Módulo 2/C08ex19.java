
public class C08ex19 {
    public static void main(String[] args) {
        int soma = 0, soma1 = 0,cont = 0;
        for (int aux=1;aux<=10000;aux++) {
            if (aux % 2 != 0) {
                soma += aux;
                cont++;
                soma1 += soma;
                if (cont == 100)
                    break;
            }
        System.out.println(soma);
        }
        System.out.println("Soma dos 100 primeiros termos: "+soma1);
    }
}
