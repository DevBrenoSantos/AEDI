import java.util.Scanner;
public class C08ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0, voto;
        for (int aux=1; aux <= 10; aux++) {
            System.out.println("Insira o voto para Fulano = 1, Ciclano = 2 e Beltrano = 3: ");
            voto = teclado.nextInt();
            if (voto == 1) {
                cont1++;
            }
            if (voto == 2) {
                cont2++;
            }
            if (voto == 3) {
                cont3++;
            }

        }
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("Fulano foi o vencedor");
        }
        if (cont2 > cont1 && cont2 > cont3) {
            System.out.println("Ciclano foi o vencedor");
        }
        if (cont3 > cont1 && cont3 > cont2) {
            System.out.println("Beltrano foi o vencedor");
        }
        System.out.println("Total de votos: Fulano = "+cont1+" Ciclano = "+cont2+" Beltrano = "+cont3);
        teclado.close();
    }
}
