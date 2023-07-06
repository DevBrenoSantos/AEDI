public class C09ex13 {
    public static void main(String[] args) {
        double den=1,result=0, fatorial=1, sinal=1;
            for (int aux=1; aux<=10; aux++) {
                fatorial *= aux;
                result += sinal * fatorial/den;
                sinal = -sinal;
                den = 2 * aux + 1;
            }
        System.out.println(result);
    }
}
