public class Financeiro {
    public static int instituicao (int cheque, String pedido) {
        int agencia, banco, sequencial;
        banco = cheque / 1000000;
        agencia = cheque / 1000 % 1000;
        sequencial = cheque % 1000;
        if (pedido.equalsIgnoreCase("agencia"))
            return agencia;
        if (pedido.equalsIgnoreCase("banco"))
            return banco;
        else {
            return sequencial;
        }
    }
}
