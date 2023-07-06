public class C09ex08 {
    public static void main(String[] args) {
        double num, den, serie=0, var=3, var2=5;
        for (int aux=1; aux<=20; aux++) {
            num = var * Math.sqrt(var2);
            var2 +=4;
            var += 2;
            den = Math.pow(5, aux);
            serie += num/den;
        }
        serie = Math.pow(serie,2);
        System.out.println(serie);
    }
}
