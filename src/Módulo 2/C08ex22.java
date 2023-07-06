import java.util.Scanner;
public class C08ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int var, cont1 = 0, cont2 = 0;
        System.out.println("Insira um número: ");
        var = teclado.nextInt();
            for (int aux=2; aux<=var;aux++) {
                if (var % aux == 0) {;
                cont1++;
                    if (cont1 >= 3) 
                    System.out.println(var+" não é primo");
                    break;
                }
                else {
                    cont2++;
                }
            }
            if (cont1 >= 3) {   
                System.out.println(var+" não é primo");
            }    
            else {
                System.out.println(var+" é primo");
            }
            System.out.println(cont2);
    teclado.close();
        }
}
