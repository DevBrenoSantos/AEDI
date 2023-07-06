import java.util.Scanner;
public class C05ex12 {
    public static void main(String[] args) {
        int seg, hr, min, seg2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o tempo de duração em segundos: ");
        seg = teclado.nextInt();
        hr = seg /3600;
        min = ((seg % 3600)/60);
        seg2 = ((seg % 3600)% 60);
        System.out.println("Horas: "+hr);
        System.out.println("Minutos: "+min);
        System.out.println("Segundos: "+seg2);
        teclado.close();
    }
}
