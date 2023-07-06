
public class C09ex07 {
    public static void main(String[] args) {
        double num, den, serie=0, cont1=0, var=1;
        for (int aux=1; aux<=6; aux++) {
            num = cont1 + (aux*3);
            var += 6;
            den = var;
            cont1 += 2;
            serie += num/den;
        }
        System.out.println(serie);
    }
}
