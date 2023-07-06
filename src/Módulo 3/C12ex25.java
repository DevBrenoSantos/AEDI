import java.util.Scanner;
public class C12ex25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontuação[] = new int[5];
        String time[] = new String[5];
        int temp, pos = -1;
        String tempnome, pesquisa;
        for (int aux=0; aux<pontuação.length; aux++) {
            System.out.print("Insira o time: ");
            time[aux] = teclado.nextLine();
            System.out.print("Insira a pontuação: ");
            pontuação[aux] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int aux=0; aux<pontuação.length-1; aux++) {
            for (int x=0; x<pontuação.length-1; x++) {
                if (pontuação[x] < pontuação[aux+1]) {
                    temp = pontuação[x];
                    pontuação[x] = pontuação[x+1];
                    pontuação[x+1] = temp;
                    tempnome = time[x];
                    time[x] = time[x+1];
                    time[x+1] = tempnome;
                }
            }
        }
        System.out.println("insira o time para procurar: ");
        pesquisa = teclado.nextLine();
        for (int aux=0; aux<time.length; aux++) {
        if (pesquisa.equalsIgnoreCase(time[aux])) {
            pos = aux;
            break;
        }
        }
        if (pos == -1) {
        System.out.println("Time não encotrado. ");
        }
        else {
        System.out.println("Time na posição "+(pos+1));
            System.out.println("pontuação: "+pontuação[pos]);
            if ((pos+1) <= 4) {
                System.out.println("Situação: Copa Libertadores");
            }
            if ((pos+1) >=5 && (pos+1) <= 12) {
                System.out.println("Situação: Copa Sul-Americana");
            }
            if ((pos+1) >= 13 && (pos+1) <=16) {
                System.out.println("Situação: Neutro");
            }
            if ((pos+1) >= 17 && (pos+1) <=20) {
                System.out.println("Situação: Rebaixado");
            }
        }
    teclado.close();
    }
}
