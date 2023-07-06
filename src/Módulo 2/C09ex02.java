public class C09ex02 {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = aux;
            den = Math.pow(aux, 2) + (aux - 1);
            serie += num/den;
        }
        System.out.println(serie);
    }
}
