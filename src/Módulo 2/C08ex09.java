import java.util.Scanner;
public class C08ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, rep, cont1 = 0, cont2 = 0, mediaM, mediaF, somaM = 0, somaF = 0;
        String nome, sexo;
        nome = "";
        System.out.print("Quatidade de pessoas que será lido: ");
        rep = teclado.nextInt();
        for (int aux=1; aux<=rep; aux++) {
            teclado.nextLine();
            System.out.println("Nome: ");
            nome = teclado.nextLine();
            System.out.println("Idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Sexo: ");
            sexo = teclado.nextLine();
                if (sexo.equalsIgnoreCase("M")) {
                    cont1++;
                    somaM += idade;
                }
                if (sexo.equalsIgnoreCase("F")) {
                    cont2++;
                    somaF += idade;
                }
        }
        mediaM = somaM/cont1;
        mediaF = somaF/cont2;
        System.out.println("Média das idades dos homens = "+mediaM);
        System.out.println("Média das idades das mulheres = "+mediaF);
        System.out.println(nome);
        teclado.close();
    }
}
