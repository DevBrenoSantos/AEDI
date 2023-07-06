public class C09ex12 {
    public static void main(String[] args) {
        double num1, den1, num2, den2,serie =0, serie1=0, serie2=0, var=3, var1=1;
        for (int aux=1;aux<=10000;aux++) {
           num1 = 1;
           den1 = var;
           var +=4;
        serie1 -= num1/den1;
           num2 = 1;
           den2 = var1;
           var1 +=4;
        serie2 += num2/den2;   
        }

        serie = 4*(serie1 + serie2);
        System.out.println(serie);
    }
}
