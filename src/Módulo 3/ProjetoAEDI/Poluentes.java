public class Poluentes {
    public static double poluicao(int poluente) {
        double retorno;
        if (poluente <= 1500) {
            retorno = 1200.21;
        return retorno;
        }
        if (poluente > 1500 && poluente <= 3000) {
            retorno = 1500.55;
            return retorno;
        }
        else {
            retorno = 3550.34;
            return retorno;
        }
    }
}